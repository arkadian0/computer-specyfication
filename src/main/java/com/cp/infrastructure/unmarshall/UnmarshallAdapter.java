package com.cp.infrastructure.unmarshall;

import com.cp.infrastructure.unmarshall.port.UnmarshallPort;
import com.cp.shared.model.cmd.BiosElement;
import com.cp.shared.model.cmd.InternalMemoryElement;
import com.cp.shared.model.cmd.ProcessorElement;
import com.cp.shared.model.cmd.UserElement;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnmarshallAdapter implements UnmarshallPort {

    @Override
    public <T> T unmarshallXml(File file, Class<T> unmarshallClass) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(unmarshallClass);
        Unmarshaller unmarshallerObj = jaxbContext.createUnmarshaller();
        return (T) unmarshallerObj.unmarshal(file);
    }


    @Override
    public List<ProcessorElement> unmarshallProcessorParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException {
        List<String> list = getCmdCommandAsList(command);
        return createListWithCmdParameters(list, numberOfParameters).stream()
                .map(ProcessorElement::of)
                .collect(Collectors.toList());
    }

    @Override
    public List<BiosElement> unmarshallBiosParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException {
        List<String> list = getCmdCommandAsList(command);
        return createListWithCmdParameters(list, numberOfParameters).stream()
                .map(BiosElement::of)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserElement> unmarshallUserParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException {
        List<String> list = getCmdCommandAsList(command);
        return createListWithCmdParameters(list, numberOfParameters).stream()
                .map(UserElement::of)
                .collect(Collectors.toList());
    }

    @Override
    public List<InternalMemoryElement> unmarshallInternalMemoryParameters(String command, Integer numberOfParameters) throws IOException, InterruptedException {
        List<String> list = getCmdCommandAsList(command);
        return createListWithCmdParameters(list, numberOfParameters).stream()
                .map(InternalMemoryElement::of)
                .collect(Collectors.toList());
    }

    private List<String> getCmdCommandAsList(String command) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec(command);
        p.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        return reader.lines()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
    }

    private static List<List<String>> createListWithCmdParameters(List<String> list, Integer numberOfParameters) {
        List<List<String>> parametersList = new ArrayList();
        List<String> tempList = new ArrayList<>();
        addListOfParametersToList(list, parametersList, tempList, numberOfParameters);
        return parametersList;
    }

    private static void addListOfParametersToList(List<String> list, List<List<String>> parametersList, List<String> tempList, Integer numberOfParameters) {
        Integer counter = 1;
        for (String str : list) {
            tempList.add(str);
            if (isLastParameterInGroup(counter++, numberOfParameters)) {
                parametersList.add(tempList);
                tempList = new ArrayList<>();
                tempList.add(str);
            }
        }
    }

    private static boolean isLastParameterInGroup(Integer counter, Integer numberOfParameters) {
        return counter % numberOfParameters == 0;
    }

}

