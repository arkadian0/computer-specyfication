package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsbDeviceVm {
    private String description;
    private String vendorId;
    private String productId;
    private String matchingDeviceId;
}
