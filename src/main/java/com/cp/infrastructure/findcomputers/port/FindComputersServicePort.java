package com.cp.infrastructure.findcomputers.port;

import com.cp.client.findingcomputers.AddressRangeCommand;

import java.util.List;

public interface FindComputersServicePort {
    public List<String> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand);
}
