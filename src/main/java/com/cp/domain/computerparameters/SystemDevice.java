package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.SystemDeviceElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "system_device")
class SystemDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="device_key")
    private String deviceKey;
    @OneToMany(cascade=CascadeType.ALL)

    @ManyToOne
    private ComputerParameters computer;
    private SystemDevice(SystemDeviceElement systemDeviceElement) {
        this.name = systemDeviceElement.getName();
        this.deviceKey = systemDeviceElement.getDeviceKey();
    }
    static SystemDevice of(SystemDeviceElement systemDeviceElement) {
        return new SystemDevice(systemDeviceElement);
    }
}
