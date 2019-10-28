package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class HardDriveVm {
    private String driveLetter;
    private String freeSpace;
    private String maxSpace;
    private String fileSystem;
    private String model;
    private String pnpDeviceId;
    private String hardDriveIndex;
}
