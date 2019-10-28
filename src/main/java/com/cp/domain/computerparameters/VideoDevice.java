package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.VideoCaptureDeviceElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "video_device")
class VideoDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="category")
    private String category;
    @Column(name="manufacturer")
    private String manufacturer;
    @Column(name="driver_description")
    private String driverDescription;
    @Column(name="driver_provider")
    private String driverProvider;
    @Column(name="driver_version")
    private String driverVersion;
    @Column(name="location")
    private String location;
    @Column(name="hardware_id")
    private String hardwareId;
    @ManyToOne
    private ComputerParameters computer;
    private VideoDevice(VideoCaptureDeviceElement videoCaptureDeviceElement) {
        this.name = videoCaptureDeviceElement.getName();
        this.category = videoCaptureDeviceElement.getCategory();
        this.manufacturer = videoCaptureDeviceElement.getManufacturer();
        this.driverDescription = videoCaptureDeviceElement.getDriverDescription();
        this.driverProvider = videoCaptureDeviceElement.getDriverProvider();
        this.driverVersion = videoCaptureDeviceElement.getDriverVersion();
        this.location = videoCaptureDeviceElement.getLocation();
        this.hardwareId = videoCaptureDeviceElement.getHardwareId();
    }

    static VideoDevice of(VideoCaptureDeviceElement videoCaptureDeviceElement) {
        return new VideoDevice(videoCaptureDeviceElement);
    }
}
