package com.cp.application.ports;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface SpecificationComputerApplicationPort {
    boolean generateAndPersistComputerParameters() throws InterruptedException, JAXBException, IOException;;
}
