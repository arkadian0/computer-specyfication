package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DxDiag")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DxDiagElement {

    @XmlElement(name = "LogicalDisks")
    private LogicalDisksRootElement logicalDisksRootElement;
    @XmlElement(name = "LogicalDisk")
    private LogicalDiskRootElement logicalDiskRootElement;
    @XmlElement(name = "SystemInformation")
    private SystemInformationElement systemInfomationElement;
    @XmlElement(name = "DisplayDevices")
    private DisplayDevicesElement displayDevicesElement;
    @XmlElement(name = "DirectSound")
    private DirectSoundElement directSoundElement;
    @XmlElement(name = "DirectInput")
    private DirectInputElement directInputElement;
    @XmlElement(name = "VideoCaptureDevices")
    private VideoCaptureDevicesElement videoCaptureDevicesElement;
    @XmlElement(name = "SystemDevices")
    private SystemDevicesElement systemDevicesElement;

}
