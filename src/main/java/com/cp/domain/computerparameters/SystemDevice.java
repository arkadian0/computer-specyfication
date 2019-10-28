package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.SystemDeviceDriverElement;
import com.cp.shared.model.xml.SystemDeviceElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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
    @OneToMany
    @JoinColumn(name="system_device_id")
    private List<SystemDeviceDriver> systemDeviceDriver;
    @ManyToOne
    private ComputerParameters computer;
    private SystemDevice(SystemDeviceElement systemDeviceElement) {
        this.name = systemDeviceElement.getName();
        this.deviceKey = systemDeviceElement.getDeviceKey();
        this.systemDeviceDriver = generateSystemDeviceDriver(systemDeviceElement);
    }

    private List<SystemDeviceDriver> generateSystemDeviceDriver(SystemDeviceElement systemDeviceElement) {
        List<SystemDeviceDriverElement> systemDeviceDriverElements = systemDeviceElement.getSystemDeviceDriver().getSystemDeviceDriverElements();
        return  Optional.ofNullable(systemDeviceDriverElements)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .map(SystemDeviceDriver::of)
                .collect(Collectors.toList());
    }

    static SystemDevice of(SystemDeviceElement systemDeviceElement) {
        return new SystemDevice(systemDeviceElement);
    }
}
