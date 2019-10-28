package com.cp.config;

import org.springframework.beans.factory.annotation.Value;

public class CmdCommandValue {


    @Value("${cmd.command.internal-memory-parameters}")
    public String cmdInternalMemoryInfoCommand;

    @Value("${cmd.number-of-parameters.internal-memory}")
    public Integer cmdNumberOfParameterInternalMemory;

    @Value("${cmd.command.processor-parameters}")
    public String cmdProcessorInfoCommand;

    @Value("${cmd.number-of-parameters.processor}")
    public Integer cmdNumberOfParameterProcessor;

    @Value("${cmd.command.bios-parameters}")
    public String cmdBiosInfoCommand;

    @Value("${cmd.number-of-parameters.bios}")
    public Integer cmdNumberOfParameterBios;

    @Value("${cmd.command.user-parameters}")
    public String cmdUserInfoCommand;

    @Value("${cmd.number-of-parameters.user}")
    public Integer cmdNumberOfParameterUser;
}
