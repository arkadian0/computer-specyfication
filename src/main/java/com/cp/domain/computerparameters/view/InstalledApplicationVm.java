package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InstalledApplicationVm {
    private String name;
    private String caption;
    private String description;
    private String identifyingNumber;
    private String vendor;
    private String version;
    private String installDate;
    private String installSource;
    private String localPackages;
}
