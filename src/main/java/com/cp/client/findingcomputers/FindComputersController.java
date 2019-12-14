package com.cp.client.findingcomputers;

import com.cp.application.ports.FindComputersApplicationPort;
import com.cp.client.transfer.ComputerInNetworkDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/search")
public class FindComputersController {

    private final FindComputersApplicationPort findComputersApplicationPort;

    @PostMapping("/active-computers")
    public List<ComputerInNetworkDTO> getActiveComputerByIpRangeInLocalArea(@Valid @RequestBody AddressRangeCommand addressRangeCommand) {
        return findComputersApplicationPort.getActiveComputersByIpRangeInLocalArea(addressRangeCommand);
    }

}

