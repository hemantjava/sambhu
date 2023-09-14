package com.example.sambhu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleRequest {

    private String userId;
    private String countryCode;
    private String langCode;
    private String participantType;
    private String deletedRecord;
}
