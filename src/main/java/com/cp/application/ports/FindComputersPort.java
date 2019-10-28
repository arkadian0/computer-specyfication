package com.cp.application.ports;

import com.cp.client.findingcomputers.AddressRangeCommand;

import java.util.List;

public interface FindComputersPort {
    List<String> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand);
}
