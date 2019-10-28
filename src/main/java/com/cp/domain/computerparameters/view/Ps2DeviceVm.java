package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ps2DeviceVm {
    private String description;
    private String vendorId;
    private String productId;
    private String matchingDeviceId;
}
