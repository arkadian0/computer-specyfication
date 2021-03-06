package com.cp.infrastructure.findcomputers.port;

import com.cp.client.findingcomputers.AddressRangeCommand;
import com.cp.client.transfer.ComputerInNetworkDTO;

import java.util.List;

public interface FindComputersServicePort {
    List<ComputerInNetworkDTO> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand);
}
