package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LogicalDisk")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogicalDiskElement {

    @XmlElement(name = "DriveLetter")
    private String driveLetter;

    @XmlElement(name = "FreeSpace")
    private String freeSpace;

    @XmlElement(name = "MaxSpace")
    private String maxSpace;

    @XmlElement(name = "FileSystem")
    private String fileSystem;

    @XmlElement(name = "Model")
    private String model;

    @XmlElement(name = "PNPDeviceID")
    private String pnpDeviceId;

    @XmlElement(name = "HardDriveIndex")
    private String hardDriveIndex;

}
