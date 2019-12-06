package com.cp.infrastructure.unmarshall;

import com.cp.infrastructure.unmarshall.port.UnmarshallXmlPort;
import com.cp.shared.model.cmd.*;
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
public class UnmarshallXmlAdapter implements UnmarshallXmlPort {
    @Override
    public <T> T unmarshall(File file, Class<T> unmarshallClass) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(unmarshallClass);
        Unmarshaller unmarshallerObj = jaxbContext.createUnmarshaller();
        return (T) unmarshallerObj.unmarshal(file);
    }
}

