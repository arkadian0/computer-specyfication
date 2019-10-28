package com.cp.shared.model.cmd;

import lombok.Data;

import java.util.List;

@Data
public class ProcessorElement {
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

    ProcessorElement(List<String> parameters) {
        this.currentClockSpeed = getParameterFromSplitedString(parameters.get(0));
        this.description = getParameterFromSplitedString(parameters.get(1));
        this.l2CacheSize = getParameterFromSplitedString(parameters.get(2));
        this.l2CacheSpeed = getParameterFromSplitedString(parameters.get(3));
        this.l3CacheSize = getParameterFromSplitedString(parameters.get(4));
        this.l3CacheSpeed = getParameterFromSplitedString(parameters.get(5));
        this.manufacturer = getParameterFromSplitedString(parameters.get(6));
        this.maxClockSpeed = getParameterFromSplitedString(parameters.get(7));
        this.name = getParameterFromSplitedString(parameters.get(8));
        this.numberOfCores = getParameterFromSplitedString(parameters.get(9));
        this.numberOfEnabledCores = getParameterFromSplitedString(parameters.get(10));
        this.numberOfLogicalProcessors = getParameterFromSplitedString(parameters.get(11));
        this.status = getParameterFromSplitedString(parameters.get(12));
    }

    public static ProcessorElement of(List<String> parameters) {
        return new ProcessorElement(parameters);
    }

    private String getParameterFromSplitedString(String parameter){
        if(parameter.split("=").length == 2)
            return parameter.split("=")[1];
        return null;
    }




}
