package com.cp.application.ports;

import com.cp.domain.computerparameters.ComputerParametersProjection;
import com.cp.domain.computerparameters.view.*;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Collection;

public interface SpecificationComputerApplicationPort {

    boolean isGeneratedComputerParameters(String ipAddress);

    ComputerParametersProjection persistComputerParameters(String computerName,String ipAddress) throws InterruptedException, JAXBException, IOException;;
}
