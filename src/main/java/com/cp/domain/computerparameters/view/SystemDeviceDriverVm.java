package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SystemDeviceDriverVm {
    private String name;
    private String path;
    private String version;
    private String language;
    private String date;
}
