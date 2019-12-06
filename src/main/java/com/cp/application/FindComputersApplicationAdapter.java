package com.cp.application;

import com.cp.application.ports.FindComputersApplicationPort;
import com.cp.client.findingcomputers.AddressRangeCommand;
import com.cp.client.transfer.ComputerInNetworkDTO;
import com.cp.infrastructure.findcomputers.port.FindComputersServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindComputersApplicationAdapter implements FindComputersApplicationPort {

    private final FindComputersServicePort findComputersServicePort;

    @Override
    public List<ComputerInNetworkDTO> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand) {
        return findComputersServicePort.getActiveComputersByIpRangeInLocalArea(addressRangeCommand);
    }
}
