package com.cp.domain.computerparameters;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Builder
@Table(name = "computer")
class ComputerParameters/* implements ComputerParametersProjection*/ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "computer")
    private List<Bios> bios;
    /*@OneToMany(mappedBy = "computer")
    private List<CaptureDevice> captureDevices;
    @OneToMany(mappedBy = "computer")
    private List<DirectInputDevice> directInputDevices;
    @OneToMany(mappedBy = "computer")
    private List<DisplayDevice> displayDevices;
    @OneToMany(mappedBy = "computer")
    private List<HardDrive> hardDrives;
    @OneToMany(mappedBy = "computer")
    private List<InternalMemory> internalMemories;
    @OneToMany(mappedBy = "computer")
    private List<Processor> processors;
    @OneToMany(mappedBy = "computer")
    private List<Ps2Device> ps2Devices;
    @OneToMany(mappedBy = "computer")
    private List<SoundDevice> soundDevices;
    @OneToMany(mappedBy = "computer")
    private List<SystemDevice> systemDevices;
    @OneToMany(mappedBy = "computer")
    private List<UsbDevice> usbDevices;
    @OneToMany(mappedBy = "computer")
    private List<SystemUser> users;
    @OneToMany(mappedBy = "computer")
    private List<VideoDevice> videoDevices;
    @OneToMany(mappedBy = "computer")
    private OperatingSystem operatingSystem;*/

}
