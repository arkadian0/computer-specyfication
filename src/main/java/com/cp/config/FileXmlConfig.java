package com.cp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

@Configuration
public class FileXmlConfig {

    @Value("${computer-specifications.filename}")
    String filepath;

    @Bean
    public File xmlFileToUnmarshall() throws IOException {
        File file =  new File(System.getProperty("user.home") + "/" + filepath);
        file.createNewFile();
        return file;
    }

}
