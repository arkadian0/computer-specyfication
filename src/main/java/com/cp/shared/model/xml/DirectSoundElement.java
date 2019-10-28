package com.cp.shared.model.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DirectSound")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectSoundElement {

    @XmlElement(name = "SoundDevices")
    private SoundDevicesElement soundDevicesElements;
    @XmlElement(name = "SoundCaptureDevices")
    private SoundCaptureDevicesElement soundCaptureDevicesElements;
}
