package com.cp.client.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class ComputerInfoDTO {
    private Integer computerId;
    private String computerName;
    private String ipAddress;
    private LocalDateTime generationDate;
}
