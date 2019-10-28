package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "InputRelatedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InputRelatedDeviceUsbElement {


    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "VendorID")
    private String vendorId;

    @XmlElement(name= "ProductID")
    private String productId;

    @XmlElement(name = "MatchingDeviceID")
    private String matchingDeviceId;
}
