package com.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(CruddemoApplication.class, args);
		String xmlFileName = ctx.getEnvironment().getProperty("computers-specyfication.filename");
		String pathfile = crateSpecificationComputerXmlFile(xmlFileName);
		executeDxDiagCmdCommand(pathfile);
	}

	private static String crateSpecificationComputerXmlFile(String xmlFileName) throws IOException {
		Path currentRelativePath = Paths.get("");
		String path = currentRelativePath.toAbsolutePath().toString() + "\\" + xmlFileName;
		File computerSpecificationFileXml = new File(path);
		if (computerSpecificationFileXml.exists()) {
			if(!computerSpecificationFileXml.delete())
				throw new IllegalStateException("Cannot delete file in path : " + path);
		}
		if (!computerSpecificationFileXml.createNewFile())
			throw new IllegalStateException("Cannot create folder in path : " + path);
		return path;
	}

	private static void executeDxDiagCmdCommand(String pathfile) {
		try {
			Process p = Runtime.getRuntime().exec("cmd /c start /wait  dxdiag /dontskip /x " + pathfile);
			p.waitFor();
		} catch (Exception e) {
			throw new IllegalStateException("Cannot execute cmd command : cmd /c start /wait dxdiag /x " + pathfile);
		}
	}
}
