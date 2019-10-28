package com.cp.application;

import com.cp.application.ports.FindComputersPort;
import com.cp.client.findingcomputers.AddressRangeCommand;
import com.cp.infrastructure.findcomputers.port.FindComputersServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindComputersAdapter implements FindComputersPort {

    private final FindComputersServicePort findComputersServicePort;

    @Override
    public List<String> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand) {
        return findComputersServicePort.getActiveComputersByIpRangeInLocalArea(addressRangeCommand);
    }
}
