package com.cp.infrastructure.unmarshall.port;

import javax.xml.bind.JAXBException;
import java.io.File;

public interface UnmarshallXmlPort {
     <T> T unmarshall(File file, Class<T> unmarshallClass) throws JAXBException;
}
