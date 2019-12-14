package com.cp.client.transfer;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class ComputerInNetworkDTO {
    private String ipAddress;
    private String computerName;
    private Timestamp generationDate;
}
