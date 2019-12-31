package com.cp.client.computerparameters;

import com.cp.client.transfer.ComputerInfoDTO;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/computers")
public class ComputerQueryController {

    private final ComputerParametersQueryPort computerParametersQueryPort;

    @GetMapping("/all/grouped")
    public List<ComputerInfoDTO> getAllComputersGroupedByComputerName(){
        return computerParametersQueryPort.getAllComputerInformationGroupedByComputerName();
    }

    @GetMapping("/all/{computerName}")
    public List<ComputerInfoDTO> getAllComputersByComputerName(@PathVariable String computerName){
        return computerParametersQueryPort.getAllComputersByComputerName(computerName);
    }

    @GetMapping("/isAvaliable")
    public boolean isAvaliable(){
        return true;
    }
}
