package com.cp.infrastructure.unmarshall.port;

import com.cp.shared.model.cmd.BiosElement;
import com.cp.shared.model.cmd.InternalMemoryElement;
import com.cp.shared.model.cmd.ProcessorElement;
import com.cp.shared.model.cmd.UserElement;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface UnmarshallPort {

     <T> T unmarshallXml(File file, Class<T> unmarshallClass) throws JAXBException;

     List<InternalMemoryElement> unmarshallInternalMemoryParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException;

     List<ProcessorElement> unmarshallProcessorParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException;

     List<BiosElement> unmarshallBiosParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException;

     List<UserElement> unmarshallUserParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException;

}
