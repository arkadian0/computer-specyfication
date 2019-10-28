package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DirectInputDeviceVm {
    private String deviceName;
    private String attached;
    private String vendorId;
    private String productId;
}
