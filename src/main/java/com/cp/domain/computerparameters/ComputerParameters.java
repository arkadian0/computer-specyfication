package com.cp.domain.computerparameters;


import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Table(name = "computer")
class ComputerParameters implements ComputerParametersProjection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer computerId;
    @Column(name = "name")
    private String computerName;
    @Column(name = "ip_address")
    private String ipAddress;
    @Column(name = "generation_date",nullable = false)
    private LocalDateTime generationDate;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<Bios> bios;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<CaptureDevice> captureDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<DirectInputDevice> directInputDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<DisplayDevice> displayDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<HardDrive> hardDrives;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<InternalMemory> internalMemories;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<Processor> processors;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<Ps2Device> ps2Devices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<SoundDevice> soundDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<SystemDevice> systemDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<UsbDevice> usbDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<SystemUser> users;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<VideoDevice> videoDevices;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    List<NetworkCard> networkCards;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    List<InstalledApplication> installedApplications;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="computer_id")
    private List<OperatingSystem> operatingSystems;


    public ComputerParameters(ComputerParametersProjection computerParametersProjection) {
        this.bios = computerParametersProjection.getBios();
        this.captureDevices = computerParametersProjection.getCaptureDevices();
        this.directInputDevices = computerParametersProjection.getDirectInputDevices();
        this.displayDevices = computerParametersProjection.getDisplayDevices();
        this.hardDrives = computerParametersProjection.getHardDrives();
        this.internalMemories = computerParametersProjection.getInternalMemories();
        this.computerName = computerParametersProjection.getComputerName();
        this.operatingSystems = computerParametersProjection.getOperatingSystems();
        this.processors = computerParametersProjection.getProcessors();
        this.ps2Devices = computerParametersProjection.getPs2Devices();
        this.soundDevices = computerParametersProjection.getSoundDevices();
        this.systemDevices = computerParametersProjection.getSystemDevices();
        this.usbDevices = computerParametersProjection.getUsbDevices();
        this.users = computerParametersProjection.getUsers();
        this.videoDevices = computerParametersProjection.getVideoDevices();
        this.computerId = computerParametersProjection.getComputerId();
        this.ipAddress = computerParametersProjection.getIpAddress();
        this.installedApplications = computerParametersProjection.getInstalledApplications();
        this.networkCards = computerParametersProjection.getNetworkCards();
        this.generationDate = LocalDateTime.now();
    }

    public ComputerParameters(List<DisplayDevice> displayDevices, List<OperatingSystem> operatingSystems, List<HardDrive> hardDrives, List<SoundDevice> soundDevices, List<CaptureDevice> captureDevices, List<Bios> biosList, List<InternalMemory> internalMemories, List<Processor> processors, List<SystemUser> users,
                              List<VideoDevice> videoDevices, List<SystemDevice> systemDevices, List<DirectInputDevice> directInputDevices, List<UsbDevice> usbDevices, List<Ps2Device> ps2Devices, String computerName, String ipAddress, List<NetworkCard> networkCards, List<InstalledApplication> installedApplications) {
            this.displayDevices = displayDevices;
            this.operatingSystems = operatingSystems;
            this.hardDrives = hardDrives;
            this.soundDevices = soundDevices;
            this.captureDevices = captureDevices;
            this.bios = biosList;
            this.processors = processors;
            this.internalMemories = internalMemories;
            this.users = users;
            this.videoDevices = videoDevices;
            this.systemDevices = systemDevices;
            this.directInputDevices = directInputDevices;
            this.usbDevices = usbDevices;
            this.ps2Devices = ps2Devices;
            this.computerName = computerName;
            this.ipAddress = ipAddress;
            this.networkCards = networkCards;
            this.installedApplications = installedApplications;


    }

    public static ComputerParameters of(ComputerParametersProjection computerParametersProjection) {
        return new ComputerParameters(computerParametersProjection);
    }

    public static ComputerParameters of(List<DisplayDevice> displayDevices, List<OperatingSystem> operatingSystems, List<HardDrive> hardDrives, List<SoundDevice> soundDevices, List<CaptureDevice> captureDevices, List<Bios> biosList, List<InternalMemory> internalMemories, List<Processor> processors,
                                        List<SystemUser> users, List<VideoDevice> videoDevices, List<SystemDevice> systemDevices, List<DirectInputDevice> directInputDevices, List<UsbDevice> usbDevices, List<Ps2Device> ps2Devices, String computerName, String ipAddress, List<NetworkCard> networkCards, List<InstalledApplication> installedApplications) {
        return new ComputerParameters(displayDevices, operatingSystems, hardDrives, soundDevices,
                captureDevices, biosList, internalMemories, processors, users, videoDevices, systemDevices, directInputDevices,
                usbDevices, ps2Devices, computerName, ipAddress,networkCards,installedApplications);
    }
}
