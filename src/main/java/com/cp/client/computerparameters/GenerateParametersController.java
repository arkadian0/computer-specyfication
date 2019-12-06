package com.cp.client.computerparameters;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/generate")
public class GenerateParametersController {

    private final SpecificationComputerApplicationPort specificationComputerApplicationPort;

    @PostMapping("/parameters/{computerName}/{ipAddress}")
    public ComputerParametersProjection getOperatingSystem(@PathVariable String computerName, @PathVariable String ipAddress) throws InterruptedException, JAXBException, IOException {
        return specificationComputerApplicationPort.persistComputerParameters(computerName, ipAddress);
    }

}
