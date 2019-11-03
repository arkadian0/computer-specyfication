package com.cp.domain.computerparameters.port;

import com.cp.domain.computerparameters.ComputerParametersProjection;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface ComputerParametersGeneratePort {
    ComputerParametersProjection generateComputerParameters(String computerName, String ipAddress) throws JAXBException, IOException, InterruptedException;
}
