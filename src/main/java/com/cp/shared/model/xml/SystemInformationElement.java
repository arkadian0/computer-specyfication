package com.cp.shared.model.xml;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SystemInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemInformationElement {

    @XmlElement(name = "Time")
    private String time;
    @XmlElement(name = "MachineName")
    private String machineName;
    @XmlElement(name = "MachineId")
    private String machineId;
    @XmlElement(name = "OperatingSystem")
    private String operatingSystem;
    @XmlElement(name = "Language")
    private String language;
    @XmlElement(name = "SystemManufacturer")
    private String systemManufacturer;
    @XmlElement(name = "SystemModel")
    private String systemModel;
    @XmlElement(name = "BIOS")
    private String bios;
    @XmlElement(name = "FirmwareType")
    private String firmWareType;
    @XmlElement(name = "Processor")
    private String processor;
    @XmlElement(name = "Memory")
    private String memory;
    @XmlElement(name = "AvaliableOSMem")
    private String avaliableOsMemory;
    @XmlElement(name = "PageFile")
    private String pageFile;
    @XmlElement(name = "WindowsDir")
    private String windowsDir;
    @XmlElement(name = "DirectXVersion")
    private String directXVersion;
    @XmlElement(name = "UserDPISettings")
    private String userDpiSettings;
    @XmlElement(name = "SystemDPISettings")
    private String systemDpiSettings;
}
