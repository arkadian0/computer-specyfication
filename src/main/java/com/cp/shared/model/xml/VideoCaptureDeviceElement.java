package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VideoCaptureDevice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VideoCaptureDeviceElement {
    @XmlElement(name = "FriendlyName")
    private String name;

    @XmlElement(name = "Category")
    private String category;

    @XmlElement(name = "Manufacturer")
    private String manufacturer;

    @XmlElement(name = "DriverDesc")
    private String driverDescription;

    @XmlElement(name = "DriverProvider")
    private String driverProvider;

    @XmlElement(name = "DriverVersion")
    private String driverVersion;

    @XmlElement(name = "Location")
    private String location;

    @XmlElement(name = "HardwareID")
    private String hardwareId;
}