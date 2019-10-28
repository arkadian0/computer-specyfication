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

@XmlRootElement(name = "DirectInputDevices")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class DirectInputDevicesElement {

    @XmlElement(name = "DirectInputDevice")
    private List<DirectInputDeviceElement> directInputDeviceElements;
}
