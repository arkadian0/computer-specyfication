package com.cp.threads;

import com.cp.application.ports.SpecificationComputerApplicationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class GenerateComputerParameterTask {

    @Value("${computer-specifications.filename}")
    private String computerSpecificationFileName;

    private final SpecificationComputerApplicationPort specificationComputerApplicationPort;

    @Scheduled(cron = "0 0 0/5 * * *")
    public void createXmlFileContainsDxDiagParametersOfComputer() throws IOException, JAXBException, InterruptedException {
        String pathFile = crateSpecificationComputerXmlFile(computerSpecificationFileName);
        executeDxDiagCmdCommand(pathFile);
        specificationComputerApplicationPort.generateAndPersistComputerParameters();
    }

    private String crateSpecificationComputerXmlFile(String xmlFileName) throws IOException {
        File computerSpecificationFileXml = new File(System.getProperty("user.home") +"/" + xmlFileName);
        computerSpecificationFileXml.createNewFile();
        return computerSpecificationFileXml.getPath();
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