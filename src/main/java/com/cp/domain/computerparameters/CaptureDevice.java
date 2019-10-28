package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.SoundCaptureDeviceElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "capture_device")
class CaptureDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "driver_name")
    private String driverName;
    @Column(name = "driver_version")
    private String driverVersion;
    @Column(name = "driver_date")
    private String driverDate;
    @ManyToOne
    private ComputerParameters computer;

    private CaptureDevice(SoundCaptureDeviceElement soundCaptureDeviceElement) {
        this.description = soundCaptureDeviceElement.getDescription();
        this.driverName = soundCaptureDeviceElement.getDriverName();
        this.driverVersion = soundCaptureDeviceElement.getDriverVersion();
        this.driverDate = soundCaptureDeviceElement.getDriverDate();
    }

    static CaptureDevice of(SoundCaptureDeviceElement soundCaptureDeviceElement) {
        return new CaptureDevice(soundCaptureDeviceElement);
    }
}
