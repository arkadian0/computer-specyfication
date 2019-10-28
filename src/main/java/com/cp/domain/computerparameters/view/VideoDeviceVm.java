package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoDeviceVm {
    private String name;
    private String category;
    private String manufacturer;
    private String driverDescription;
    private String driverProvider;
    private String driverVersion;
    private String location;
    private String hardwareId;
}
