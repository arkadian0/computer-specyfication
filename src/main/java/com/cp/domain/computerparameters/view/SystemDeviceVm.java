package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SystemDeviceVm {
    private String name;
    private String deviceKey;
}
