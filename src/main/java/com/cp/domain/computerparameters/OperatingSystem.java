package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.SystemInformationElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "operating_system")
class OperatingSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="time")
    private String time;
    @Column(name="machine_name")
    private String machineName;
    @Column(name="machine_id")
    private String machineId;
    @Column(name="operating_system")
    private String operatingSystem;
    @Column(name="language")
    private String language;
    @Column(name="system_manufacturer")
    private String systemManufacturer;
    @Column(name="system_model")
    private String systemModel;
    @Column(name="bios")
    private String bios;
    @Column(name="firmware_type")
    private String firmWareType;
    @Column(name="processor")
    private String processor;
    @Column(name="memory")
    private String memory;
    @Column(name="avaliable_os_memory")
    private String avaliableOsMemory;
    @Column(name="page_file")
    private String pageFile;
    @Column(name="windows_dir")
    private String windowsDir;
    @Column(name="directx_version")
    private String directXVersion;
    @Column(name="user_dpi_settings")
    private String userDpiSettings;
    @Column(name="system_dpi_settings")
    private String systemDpiSettings;
    @ManyToOne
    private ComputerParameters computer;

    private OperatingSystem(SystemInformationElement systemInformationElement) {
        this.avaliableOsMemory = systemInformationElement.getAvaliableOsMemory();
        this.time = systemInformationElement.getTime();
        this.machineName = systemInformationElement.getMachineName();
        this.machineId = systemInformationElement.getMachineId();
        this.operatingSystem = systemInformationElement.getOperatingSystem();
        this.language = systemInformationElement.getLanguage();
        this.systemManufacturer = systemInformationElement.getSystemManufacturer();
        this.systemModel = systemInformationElement.getSystemModel();
        this.bios = systemInformationElement.getBios();
        this.firmWareType = systemInformationElement.getFirmWareType();
        this.processor = systemInformationElement.getProcessor();
        this.memory = systemInformationElement.getMemory();
        this.pageFile = systemInformationElement.getPageFile();
        this.windowsDir = systemInformationElement.getWindowsDir();
        this.directXVersion = systemInformationElement.getDirectXVersion();
        this.userDpiSettings = systemInformationElement.getUserDpiSettings();
        this.systemDpiSettings = systemInformationElement.getSystemDpiSettings();
    }

    static OperatingSystem of(SystemInformationElement systemInformationElement) {
        return new OperatingSystem(systemInformationElement);
    }
}
