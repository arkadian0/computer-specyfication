package com.cp.shared.model.cmd;

import lombok.Data;

import java.util.List;

@Data
public class UserElement {
    private String caption;
    private String description;
    private String disabled;
    private String fullName;
    private String localAccount;
    private String name;
    private String passwordChangeable;
    private String passwordExpires;
    private String passwordRequired;
    private String status;

    UserElement(List<String> parameters) {
        this.caption = getParameterFromSplitedString(parameters.get(0));
        this.description = getParameterFromSplitedString(parameters.get(1));
        this.disabled = getParameterFromSplitedString(parameters.get(2));
        this.fullName = getParameterFromSplitedString(parameters.get(3));
        this.localAccount = getParameterFromSplitedString(parameters.get(4));
        this.name = getParameterFromSplitedString(parameters.get(5));
        this.passwordChangeable = getParameterFromSplitedString(parameters.get(6));
        this.passwordExpires = getParameterFromSplitedString(parameters.get(7));
        this.passwordRequired = getParameterFromSplitedString(parameters.get(8));
        this.status = getParameterFromSplitedString(parameters.get(9));
    }

    public static UserElement of(List<String> parameters) {
        return new UserElement(parameters);
    }

    private String getParameterFromSplitedString(String parameter) {
        if (parameter.split("=").length == 2)
            return parameter.split("=")[1];
        return null;
    }
}
