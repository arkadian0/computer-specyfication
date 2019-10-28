package com.cp.client.findingcomputers;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class AddressRangeCommand {
    @NotNull(message = "Network ip cannot be null")
    private String networkIp;
    @NotNull(message = "Range from of computers ip cannot be null")
    private Integer rangeFrom;
    @NotNull(message = "Range to of computers ip cannot be null")
    private Integer rangeTo;
}
