package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DisplayDevice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GraphicCardElement {

    @XmlElement(name = "CardName")
    private String cardName;
    @XmlElement(name = "Manufacturer")
    private String manufacturer;
    @XmlElement(name = "ChipType")
    private String chipType;
    @XmlElement(name = "DACType")
    private String dacType;
    @XmlElement(name = "DeviceType")
    private String deviceType;
    @XmlElement(name = "DeviceKey")
    private String deviceKey;
    @XmlElement(name = "DisplayMemory")
    private String displayMemory;
    @XmlElement(name = "DedicatedMemory")
    private String dedicatedMemory;
    @XmlElement(name = "SharedMemory")
    private String sharedMemory;
    @XmlElement(name = "CurrentMode")
    private String currentMode;
    @XmlElement(name = "HDRSupport")
    private String hdrSupport;
    @XmlElement(name = "Topology")
    private String topology;
    @XmlElement(name = "ColorSpace")
    private String colorSpace;
    @XmlElement(name = "ColorPrimaries")
    private String colorPrimaries;
    @XmlElement(name = "Luminance")
    private String luminance;
    @XmlElement(name = "DriverVersion")
    private String driverVersion;
    @XmlElement(name = "DriverModel")
    private String driverModel;
    @XmlElement(name = "DriverDate")
    private String driverDate;
    @XmlElement(name = "MonitorName")
    private String monitorName;
    @XmlElement(name = "MonitorModel")
    private String monitorModel;
    @XmlElement(name = "MonitorId")
    private String monitorId;
    @XmlElement(name = "OutputType")
    private String outputType;
    @XmlElement(name = "AdvancedColorEnabled")
    private String advancedColorEnabled;
    @XmlElement(name = "AdvancedColorSupported")
    private String advancedColorSupported;
    @XmlElement(name = "PixelFormat")
    private String pixelFormat;
    @XmlElement(name = "MonitorMaxRes")
    private String maxResolution;
    @XmlElement(name = "DriverName")
    private String driverName;
    @XmlElement(name = "VendorID")
    private String vendorId;
    @XmlElement(name = "DeviceID")
    private String deviceId;

}