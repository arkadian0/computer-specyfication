package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DisplayDeviceVm {
    private String cardName;
    private String manufacturer;
    private String chipType;
    private String dacType;
    private String deviceType;
    private String deviceKey;
    private String displayMemory;
    private String dedicatedMemory;
    private String sharedMemory;
    private String currentMode;
    private String hdrSupport;
    private String driverName;
    private String driverVersion;
    private String driverModel;
    private String driverDate;
    private String vendorId;
    private String deviceId;
    private String topology;
    private String colorSpace;
    private String colorPrimaries;
    private String luminance;
    private String monitorName;
    private String monitorModel;
    private String monitorId;
    private String outputType;
    private String advancedColorEnabled;
    private String advancedColorSupported;
    private String pixelFormat;
    private String maxResolution;
}
