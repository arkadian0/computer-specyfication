package com.cp.application.ports;

import com.cp.client.findingcomputers.AddressRangeCommand;
import com.cp.client.transfer.ComputerInNetworkDTO;

import java.util.List;

public interface FindComputersApplicationPort {
    List<ComputerInNetworkDTO> getActiveComputersByIpRangeInLocalArea(AddressRangeCommand addressRangeCommand);
}
