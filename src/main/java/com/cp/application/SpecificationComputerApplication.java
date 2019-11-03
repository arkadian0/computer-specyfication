package com.cp.application;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.port.ComputerParametersGeneratePort;
import com.cp.domain.computerparameters.port.ComputerParametersQueryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpecificationComputerApplication implements SpecificationComputerApplicationPort {

    private final ComputerParametersGeneratePort computerParametersGeneratePort;
    private final ComputerParametersQueryPort computerParametersQueryPort;

    @Override
    public ComputerParametersProjection generateAndReturnComputerParameters(String computerName, String ipAddress) throws InterruptedException, JAXBException, IOException {
        ComputerParametersProjection generatedComputerParameters = computerParametersGeneratePort.generateComputerParameters(computerName,ipAddress);

        Optional<ComputerParametersProjection> findedComputerParameters = computerParametersQueryPort.findComputerByIpAddress(ipAddress);

        findedComputerParameters.ifPresent(computerParametersProjection -> computerParametersQueryPort.deleteComputerParametersById(computerParametersProjection.getComputerId()));

        return computerParametersQueryPort.persistComputerParameters(generatedComputerParameters);
    }

}

