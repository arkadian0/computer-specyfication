package com.cp;

import com.cp.threads.GenerateComputerParameterTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;
import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class  CruddemoApplication {

    private GenerateComputerParameterTask generateComputerParameterTask;

    @Autowired
    void setGenerateComputerParameterTask(GenerateComputerParameterTask generateComputerParameterTask)
    {
        this.generateComputerParameterTask = generateComputerParameterTask;
    }

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @PostConstruct
    void init() throws InterruptedException, JAXBException, IOException {
        generateComputerParameterTask.createXmlFileContainsDxDiagParametersOfComputer();
    }
}
