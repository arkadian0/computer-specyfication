package com.cp.infrastructure.unmarshall.port;

import com.cp.shared.model.cmd.*;

import java.io.IOException;
import java.util.List;

public interface UnmarshallCmdPort {
    List<InternalMemoryElement> unmarshallInternalMemoryParameters(String command, Integer numberOfParameters) throws IOException;

    List<ProcessorElement> unmarshallProcessorParameters(String command, Integer numberOfParameters) throws IOException;

    List<BiosElement> unmarshallBiosParameters(String command, Integer numberOfParameters) throws IOException;

    List<UserElement> unmarshallUserParameters(String command, Integer numberOfParameters) throws IOException;

    List<InstalledApplicationElement> unmarshallInstalledApplication(String command, Integer numberOfParameters) throws IOException;

    List<NetworkCardElement> unmarshallNetwokCard(String command, Integer numberOfParameters) throws IOException;
}
