package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NetworkCardVm {
    private String adapterType;
    private String name;
    private String description;
    private String caption;
    private String installed;
    private String installDate;
    private String manufacturer;
    private String pnpDeviceId;
    private String macAddress;
    private String lastErrorCode;
    private String maxSpeed;
    private String powerManagementSupported;
    private String speed;
    private String status;
    private String netEnabled;
    private String netConnectionStatus;
    private String networkAddresses;
    private String permanentAddress;
    private String productName;
}
