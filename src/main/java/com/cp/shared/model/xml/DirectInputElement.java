package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "DirectInput")
@XmlAccessorType(XmlAccessType.FIELD)
public class DirectInputElement {

    @XmlElement(name = "DirectInputDevices")
    private DirectInputDevicesElement directInputDevice;

    @XmlElement(name = "USBRoot")
    private UsbRootElement usbRoot;

    @XmlElement(name = "PS2Devices")
    private Ps2DevicesElement ps2Device;
}
