package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InternalMemoryVm {
    private String manufacturer;
    private String bankLabel;
    private String serialNumber;
    private String caption;
    private String description;
    private String name;
    private String deviceLocator;
    private String capacity;
    private String memoryType;
    private String typeDetail;
    private String speed;
    private String status;
}
