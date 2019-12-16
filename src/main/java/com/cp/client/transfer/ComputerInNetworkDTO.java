package com.cp.client.transfer;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
public class ComputerInNetworkDTO {
    private String ipAddress;
    private String computerName;
    private LocalDateTime generationDate;
}
