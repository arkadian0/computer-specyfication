package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class ProcessorVm {
    private String currentClockSpeed;
    private String description;
    private String l2CacheSize;
    private String l2CacheSpeed;
    private String l3CacheSize;
    private String l3CacheSpeed;
    private String manufacturer;
    private String maxClockSpeed;
    private String name;
    private String numberOfCores;
    private String numberOfEnabledCores;
    private String numberOfLogicalProcessors;
    private String status;
}
