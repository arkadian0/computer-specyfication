package com.cp.client.findingcomputers;

import com.cp.application.ports.FindComputersPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
public class FindComputersController {

    private final FindComputersPort findComputersPort;

    @GetMapping("/active-computers")
    public List<String> getActiveComputerByIpRangeInLocalArea(@Valid @RequestBody AddressRangeCommand addressRangeCommand) {
        return findComputersPort.getActiveComputersByIpRangeInLocalArea(addressRangeCommand);
    }
}

