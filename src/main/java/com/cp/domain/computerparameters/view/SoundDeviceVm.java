package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class SoundDeviceVm {
    private String description;
    private String hardwareId;
    private String manufacturerId;
    private String productId;
    private String type;
    private String driverName;
    private String driverVersion;
    private String driverDate;
    private String driverProvider;
}
