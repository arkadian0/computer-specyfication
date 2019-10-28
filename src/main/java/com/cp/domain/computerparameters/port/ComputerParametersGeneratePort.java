package com.cp.domain.computerparameters.port;

import com.cp.domain.computerparameters.ComputerParametersProjection;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface ComputerParametersGeneratePort {
    ComputerParametersProjection generateComputerParameters() throws JAXBException, IOException, InterruptedException;
}
