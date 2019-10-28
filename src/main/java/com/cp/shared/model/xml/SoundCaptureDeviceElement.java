package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "SoundCaptureDevice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SoundCaptureDeviceElement {

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "DriverName")
    private String driverName;

    @XmlElement(name = "DriverVersion")
    private String driverVersion;

    @XmlElement(name = "DriverDate")
    private String driverDate;
}
