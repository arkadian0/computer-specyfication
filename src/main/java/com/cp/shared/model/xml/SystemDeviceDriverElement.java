package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Driver")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemDeviceDriverElement {
    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Path")
    private String path;

    @XmlElement(name = "Version")
    private String version;

    @XmlElement(name = "Language")
    private String language;

    @XmlElement(name = "Date")
    private String date;

}