package com.cp.infrastructure.findcomputers;

import com.cp.client.findingcomputers.AddressRangeCommand;
import com.cp.client.transfer.ComputerInNetworkDTO;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import com.cp.infrastructure.findcomputers.port.FindComputersServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class FindComputerServiceAdapter implements FindComputersServicePort {

    private final ComputerParametersQueryPort computerParametersQueryPort;

    @Override
    public List<ComputerInNetworkDTO> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand) {
        List<ComputerInNetworkDTO> computersInLocalArea = new ArrayList<>();
        IntStream.rangeClosed(addressRangeCommand.getRangeFrom(), addressRangeCommand.getRangeTo())
                .mapToObj(num -> addressRangeCommand.getNetworkIp() + "." + num)
                .parallel()
                .filter(this::isExistComputerForGivenAddress)
                .forEach(fullAddress -> addExistingAddressToList(computersInLocalArea, fullAddress));
        return computersInLocalArea;
    }

    private boolean isExistComputerForGivenAddress(String fullAddress) {
        try {
            return InetAddress.getByName(fullAddress).isReachable(200);
        } catch (IOException e) {
            throw new IllegalStateException("Problem witch connection to given ip address: " + fullAddress);
        }
    }

    private void addExistingAddressToList(List<ComputerInNetworkDTO> computersInLocalArea, String fullAddress) {
        try {
            Timestamp generationDate = computerParametersQueryPort.getLastGenerationDateByIpAddress(fullAddress);
            ComputerInNetworkDTO computerInNetworkDTO = buildComputerInNetworkByFullAddress(fullAddress,generationDate);
            computersInLocalArea.add(computerInNetworkDTO);
        } catch (UnknownHostException ex) {
        throw new IllegalStateException("Problem with connection to given ip address: " + fullAddress);
    }
    }

    private ComputerInNetworkDTO buildComputerInNetworkByFullAddress(String fullAddress, Timestamp generationDate) throws UnknownHostException {
        return ComputerInNetworkDTO.builder()
                .ipAddress(fullAddress)
                .computerName(InetAddress.getByName(fullAddress).getHostName())
                .generationDate(generationDate)
                .build();

    }
}
