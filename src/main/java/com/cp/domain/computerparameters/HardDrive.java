package com.cp.domain.computerparameters;

import com.cp.shared.model.xml.LogicalDiskElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "hard_drive")
class HardDrive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="driver_letter")
    private String driveLetter;
    @Column(name="free_space")
    private String freeSpace;
    @Column(name="max_space")
    private String maxSpace;
    @Column(name="file_system")
    private String fileSystem;
    @Column(name="model")
    private String model;
    @Column(name="pnp_device_id")
    private String pnpDeviceId;
    @Column(name="hard_drive_index")
    private String hardDriveIndex;
    @ManyToOne
    private ComputerParameters computer;

    private HardDrive(LogicalDiskElement logicalDiskElement) {
        this.driveLetter = logicalDiskElement.getDriveLetter();
        this.freeSpace = logicalDiskElement.getFreeSpace();
        this.maxSpace = logicalDiskElement.getMaxSpace();
        this.fileSystem = logicalDiskElement.getFileSystem();
        this.model = logicalDiskElement.getModel();
        this.pnpDeviceId = logicalDiskElement.getPnpDeviceId();
        this.hardDriveIndex = logicalDiskElement.getHardDriveIndex();

    }

    static HardDrive of(LogicalDiskElement logicalDiskElement) {
        return new HardDrive(logicalDiskElement);
    }
}
