package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.SystemDeviceDriverElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "system_device_driver")
class SystemDeviceDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="path")
    private String path;
    @Column(name="version")
    private String version;
    @Column(name="language")
    private String language;
    @Column(name="date")
    private String date;
    @ManyToOne
    private SystemDevice systemDevice;

    private SystemDeviceDriver(SystemDeviceDriverElement systemDeviceDriverElement) {
        this.name = systemDeviceDriverElement.getName();
        this.path = systemDeviceDriverElement.getPath();
        this.version = systemDeviceDriverElement.getVersion();
        this.language = systemDeviceDriverElement.getLanguage();
        this.date = systemDeviceDriverElement.getDate();

    }

    static SystemDeviceDriver of(SystemDeviceDriverElement systemDeviceDriverElement) {
        return new SystemDeviceDriver(systemDeviceDriverElement);
    }
}
