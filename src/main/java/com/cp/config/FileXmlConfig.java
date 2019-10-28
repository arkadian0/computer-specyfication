package com.cp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class FileXmlConfig {

    @Value("${computers-specyfication.filename}")
    String fileName;

    @Bean
    public File xmlFileToUnmarshall(){
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString() + "\\" + fileName;
        return new File(path);
    }

}
