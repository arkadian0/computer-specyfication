package com.cp.shared.model.cmd;

import lombok.Data;

import java.util.List;

@Data
public class InstalledApplicationElement {
    private String name;
    private String caption;
    private String description;
    private String identifyingNumber;
    private String vendor;
    private String version;
    private String installDate;
    private String installSource;
    private String localPackages;

    InstalledApplicationElement(List<String> parameters) {
        this.caption = getParameterFromSplitedString(parameters.get(0));
        this.description = getParameterFromSplitedString(parameters.get(1));
        this.identifyingNumber = getParameterFromSplitedString(parameters.get(2));
        this.installDate = getParameterFromSplitedString(parameters.get(3));
        this.installSource = getParameterFromSplitedString(parameters.get(4));
        this.localPackages = getParameterFromSplitedString(parameters.get(5));
        this.name = getParameterFromSplitedString(parameters.get(6));
        this.vendor = getParameterFromSplitedString(parameters.get(7));
        this.version = getParameterFromSplitedString(parameters.get(8));
    }

    public static InstalledApplicationElement of(List<String> parameters) {
        return new InstalledApplicationElement(parameters);
    }

    private String getParameterFromSplitedString(String parameter){
        if(parameter.split("=").length == 2)
            return parameter.split("=")[1];
        return null;
    }

}
