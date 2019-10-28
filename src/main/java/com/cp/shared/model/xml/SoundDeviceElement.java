package com.cp.shared.model.xml;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SoundDevice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SoundDeviceElement {

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "HardwareID")
    private String hardwareID;

    @XmlElement(name = "ManufacturerID")
    private String manufacturerId;

    @XmlElement(name = "ProductID")
    private String productId;

    @XmlElement(name = "Type")
    private String type;

    @XmlElement(name = "DriverName")
    private String driverName;

    @XmlElement(name = "DriverVersion")
    private String driverVersion;

    @XmlElement(name = "DriverDate")
    private String driverDate;

    @XmlElement(name = "DriverProvider")
    private String driverProvider;

}
