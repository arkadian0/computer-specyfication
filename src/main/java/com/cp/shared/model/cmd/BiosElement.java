package com.cp.shared.model.cmd;

import lombok.Data;

import java.util.List;

@Data
public class BiosElement {
    private String biosVersion;
    private String caption;
    private String currentLanguage;
    private String description;
    private String manufacturer;
    private String name;
    private String primaryBios;
    private String status;


    BiosElement(List<String> parameters) {
        this.biosVersion = getParameterFromSplitedString(parameters.get(0));
        this.caption = getParameterFromSplitedString(parameters.get(1));
        this.currentLanguage = getParameterFromSplitedString(parameters.get(2));
        this.description = getParameterFromSplitedString(parameters.get(3));
        this.manufacturer = getParameterFromSplitedString(parameters.get(4));
        this.name = getParameterFromSplitedString(parameters.get(5));
        this.primaryBios = getParameterFromSplitedString(parameters.get(6));
        this.status = getParameterFromSplitedString(parameters.get(7));
    }

    public static BiosElement of(List<String> biosElements) {
        return new BiosElement(biosElements);
    }

    private String getParameterFromSplitedString(String parameter){
        if(parameter.split("=").length == 2)
            return parameter.split("=")[1];
        return null;
    }


}
