package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DirectInputDevice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectInputDeviceElement {

    @XmlElement(name = "DeviceName")
    private String deviceName;

    @XmlElement(name = "Attached")
    private String attached;

    @XmlElement(name = "VendorID")
    private String vendorId;

    @XmlElement(name= "ProductID")
    private String productId;

}