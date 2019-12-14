package com.cp.threads;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class GenerateComputerParameterTask {

    @Value("${computers-specyfication.filename}")
    private String computerSpecyficationFileName;

    private final SpecificationComputerApplicationPort specificationComputerApplicationPort;

    @Scheduled(cron="0 0 0/5 * * *")
    public void createXmlFileContainsDxDiagParametersOfComputer() throws IOException, JAXBException, InterruptedException {
        String pathFile = crateSpecificationComputerXmlFile(computerSpecyficationFileName);
        executeDxDiagCmdCommand(pathFile);
        specificationComputerApplicationPort.generateAndPersistComputerParameters();
    }

    private String crateSpecificationComputerXmlFile(String xmlFileName) throws IOException {
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString() + "\\" + xmlFileName;
        File computerSpecificationFileXml = new File(path);
        if (computerSpecificationFileXml.exists()) {
            if (!computerSpecificationFileXml.delete())
                throw new IllegalStateException("Cannot delete file in path : " + path);
        }
        if (!computerSpecificationFileXml.createNewFile())
            throw new IllegalStateException("Cannot create folder in path : " + path);
        return path;
    }

    private void executeDxDiagCmdCommand(String pathfile) {
        try {
            Process p = Runtime.getRuntime().exec("cmd /c start /wait  dxdiag /dontskip /x " + pathfile);
            p.waitFor();
        } catch (Exception e) {
            throw new IllegalStateException("Cannot execute cmd command : cmd /c start /wait dxdiag /x " + pathfile);
        }
    }

}