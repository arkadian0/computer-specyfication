package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.SoundDeviceElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "sound_device")
class SoundDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="description")
    private String description;
    @Column(name="hardware_id")
    private String hardwareId;
    @Column(name="manufacturer_id")
    private String manufacturerId;
    @Column(name="productId")
    private String productId;
    @Column(name="type")
    private String type;
    @Column(name="driver_name")
    private String driverName;
    @Column(name="driver_version")
    private String driverVersion;
    @Column(name="driver_date")
    private String driverDate;
    @Column(name="driver_provider")
    private String driverProvider;
    @ManyToOne
    private ComputerParameters computer;

    private SoundDevice(SoundDeviceElement soundDeviceElement) {
        this.description = soundDeviceElement.getDescription();
        this.hardwareId = soundDeviceElement.getHardwareID();
        this.manufacturerId = soundDeviceElement.getManufacturerId();
        this.productId = soundDeviceElement.getProductId();
        this.type = soundDeviceElement.getType();
        this.driverName = soundDeviceElement.getDriverName();
        this.driverVersion = soundDeviceElement.getDriverVersion();
        this.driverDate = soundDeviceElement.getDriverDate();
        this.driverProvider = soundDeviceElement.getDriverProvider();
    }

    static SoundDevice of(SoundDeviceElement soundDeviceElement) {
       return new SoundDevice(soundDeviceElement);
    }
}
