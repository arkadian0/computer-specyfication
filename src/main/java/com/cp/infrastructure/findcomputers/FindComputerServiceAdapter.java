package com.cp.infrastructure.findcomputers;

import com.cp.client.findingcomputers.AddressRangeCommand;
import com.cp.infrastructure.findcomputers.port.FindComputersServicePort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class FindComputerServiceAdapter implements FindComputersServicePort {

    @Override
    public List<String> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand) {
        List<String> computersInLocalArea = new ArrayList<>();
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

    private void addExistingAddressToList(List<String> computersInLocalArea, String fullAddress) {
        try {
            computersInLocalArea.add(InetAddress.getByName(fullAddress).getHostName());
        } catch (UnknownHostException ex) {
            throw new IllegalStateException("Problem with connection to given ip address: " + fullAddress);
        }
    }
}
