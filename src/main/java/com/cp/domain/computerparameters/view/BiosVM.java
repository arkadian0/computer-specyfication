package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BiosVM {
    private Integer biosId;
    private String biosVersion;
    private String caption;
    private String currentLanguage;
    private String description;
    private String manufacturer;
    private String name;
    private String primaryBios;
    private String status;
}
