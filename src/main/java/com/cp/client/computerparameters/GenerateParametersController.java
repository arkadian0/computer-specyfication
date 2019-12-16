package com.cp.client.computerparameters;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/generate")
public class GenerateParametersController {

    private final SpecificationComputerApplicationPort specificationComputerApplicationPort;

    @GetMapping("/parameters")
    public boolean getOperatingSystem() throws InterruptedException, JAXBException, IOException {
        return specificationComputerApplicationPort.generateAndPersistComputerParameters();
    }

}
