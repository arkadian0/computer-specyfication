package com.cp.domain.computerparameters.view;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SystemUserVm {
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
}
