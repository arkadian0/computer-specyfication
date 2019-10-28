package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OperatingSystemVm {
    private String time;
    private String machineName;
    private String machineId;
    private String operatingSystem;
    private String language;
    private String systemManufacturer;
    private String systemModel;
    private String bios;
    private String firmWareType;
    private String processor;
    private String memory;
    private String avaliableOsMemory;
    private String pageFile;
    private String windowsDir;
    private String directXVersion;
    private String userDpiSettings;
    private String systemDpiSettings;
}
