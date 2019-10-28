package com.cp.domain.computerparameters;

import com.cp.shared.model.cmd.InternalMemoryElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "internal_memory")
class InternalMemory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "bank_label")
    private String bankLabel;
    @Column(name = "serial_number")
    private String serialNumber;
    @Column(name = "caption")
    private String caption;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "device_locator")
    private String deviceLocator;
    @Column(name = "capacity")
    private String capacity;
    @Column(name = "memory_type")
    private String memoryType;
    @Column(name = "type_detail")
    private String typeDetail;
    @Column(name = "speed")
    private String speed;
    @Column(name = "status")
    private String status;
    @ManyToOne
    private ComputerParameters computer;

    private InternalMemory(InternalMemoryElement internalMemoryElement) {
        this.manufacturer = internalMemoryElement.getManufacturer();
        this.bankLabel = internalMemoryElement.getBankLabel();
        this.capacity = internalMemoryElement.getCapacity();
        this.memoryType = internalMemoryElement.getMemoryType();
        this.typeDetail = internalMemoryElement.getTypeDetail();
        this.speed = internalMemoryElement.getSpeed();
        this.serialNumber = internalMemoryElement.getSerialNumber();
        this.name = internalMemoryElement.getName();
        this.deviceLocator = internalMemoryElement.getDeviceLocator();
        this.caption = internalMemoryElement.getCaption();
        this.description = internalMemoryElement.getDescription();
        this.status = internalMemoryElement.getStatus();
    }

    static InternalMemory of(InternalMemoryElement internalMemoryElement) {
        return new InternalMemory(internalMemoryElement);
    }
}


