package com.cp.shared.model.cmd;

import lombok.Data;

import java.util.List;

@Data
public class NetworkCardElement {
    private String adapterType;
    private String name;
    private String description;
    private String caption;
    private String installed;
    private String installDate;
    private String manufacturer;
    private String pnpDeviceId;
    private String macAddress;
    private String lastErrorCode;
    private String maxSpeed;
    private String powerManagementSupported;
    private String speed;
    private String status;
    private String netEnabled;
    private String netConnectionStatus;
    private String networkAddresses;
    private String permanentAddress;
    private String productName;

    NetworkCardElement(List<String> parameters) {
        this.adapterType = getParameterFromSplitedString(parameters.get(0));
        this.caption = getParameterFromSplitedString(parameters.get(1));
        this.description = getParameterFromSplitedString(parameters.get(2));
        this.installDate = getParameterFromSplitedString(parameters.get(3));
        this.installed = getParameterFromSplitedString(parameters.get(4));
        this.lastErrorCode = getParameterFromSplitedString(parameters.get(5));
        this.macAddress = getParameterFromSplitedString(parameters.get(6));
        this.manufacturer = getParameterFromSplitedString(parameters.get(7));
        this.maxSpeed = getParameterFromSplitedString(parameters.get(8));
        this.name = getParameterFromSplitedString(parameters.get(9));
        this.netConnectionStatus = getParameterFromSplitedString(parameters.get(10));
        this.netEnabled = getParameterFromSplitedString(parameters.get(11));
        this.networkAddresses = getParameterFromSplitedString(parameters.get(12));
        this.permanentAddress = getParameterFromSplitedString(parameters.get(13));
        this.pnpDeviceId = getParameterFromSplitedString(parameters.get(14));
        this.powerManagementSupported = getParameterFromSplitedString(parameters.get(15));
        this.productName = getParameterFromSplitedString(parameters.get(16));
        this.speed = getParameterFromSplitedString(parameters.get(17));
        this.status = getParameterFromSplitedString(parameters.get(18));
    }

    public static NetworkCardElement of(List<String> parameters) {
        return new NetworkCardElement(parameters);
    }

    private String getParameterFromSplitedString(String parameter){
        if(parameter.split("=").length == 2)
            return parameter.split("=")[1];
        return null;
    }
}
