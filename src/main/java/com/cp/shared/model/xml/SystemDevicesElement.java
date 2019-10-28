package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@AllArgsConstructor
@XmlRootElement(name = "SystemDevices")
@Data
@Builder
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class SystemDevicesElement {

    @XmlElement(name = "SystemDevice")
    private List<SystemDeviceElement> systemDeviceElements;
}
