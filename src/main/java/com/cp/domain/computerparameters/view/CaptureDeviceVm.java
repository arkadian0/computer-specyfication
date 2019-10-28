package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaptureDeviceVm {
    private String description;
    private String driverName;
    private String driverVersion;
    private String driverDate;
}
