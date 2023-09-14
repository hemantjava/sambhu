package com.example.sambhu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleResponse {
    private Integer statusCode;
    private String message;
    private String[] getAlldealerList = {"D,1m180,dddd", "D,1m180,dddd", "D,1m180,dddd"};
    private List<Dealer> getAllDealers;

}
