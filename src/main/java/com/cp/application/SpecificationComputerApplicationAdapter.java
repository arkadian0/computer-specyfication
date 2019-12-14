package com.cp.application;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.port.ComputerParametersGeneratePort;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class SpecificationComputerApplicationAdapter implements SpecificationComputerApplicationPort {

    private final ComputerParametersGeneratePort computerParametersGeneratePort;
    private final ComputerParametersQueryPort computerParametersQueryPort;

    @Override
    public boolean generateAndPersistComputerParameters() throws InterruptedException, JAXBException, IOException {
        ComputerParametersProjection generatedComputerParameters = computerParametersGeneratePort.generateComputerParameters();
        ComputerParametersProjection persistedComputerParameters = computerParametersQueryPort.persistComputerParameters(generatedComputerParameters);
        return persistedComputerParameters != null;
    }

}

