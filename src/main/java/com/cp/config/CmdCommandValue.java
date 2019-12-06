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

    @Value("${cmd.command.network-card}")
    public String cmdNetworkCardInfoCommand;

    @Value("${cmd.number-of-parameters.network-card}")
    public Integer cmdNumberOfParameterNetworkCard;

    @Value("${cmd.command.installed-application}")
    public String cmdInstalledApplicationInfoCommand;

    @Value("${cmd.number-of-parameters.installed-application}")
    public Integer cmdNumberOfParameterInstalledApplication;
}
