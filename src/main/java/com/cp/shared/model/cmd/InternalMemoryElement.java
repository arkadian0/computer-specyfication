package com.cp.shared.model.cmd;

import lombok.Data;

import java.util.List;

@Data
public class InternalMemoryElement {
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

    InternalMemoryElement(List<String> parameters) {
        this.bankLabel = getParameterFromSplitedString(parameters.get(0));
        this.capacity = getParameterFromSplitedString(parameters.get(1));
        this.caption = getParameterFromSplitedString(parameters.get(2));
        this.description = getParameterFromSplitedString(parameters.get(3));
        this.deviceLocator = getParameterFromSplitedString(parameters.get(4));
        this.manufacturer = getParameterFromSplitedString(parameters.get(5));
        this.memoryType = getParameterFromSplitedString(parameters.get(6));
        this.name = getParameterFromSplitedString(parameters.get(7));
        this.serialNumber = getParameterFromSplitedString(parameters.get(8));
        this.speed = getParameterFromSplitedString(parameters.get(9));
        this.status = getParameterFromSplitedString(parameters.get(10));
        this.typeDetail = getParameterFromSplitedString(parameters.get(11));
    }

    public static InternalMemoryElement of(List<String> parameters) {
        return new InternalMemoryElement(parameters);
    }

    private String getParameterFromSplitedString(String parameter){
        if(parameter.split("=").length == 2)
            return parameter.split("=")[1];
        return null;
    }

}