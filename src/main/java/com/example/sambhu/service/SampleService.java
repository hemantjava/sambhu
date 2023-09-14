package com.example.sambhu.service;

import com.example.sambhu.dto.Dealer;
import com.example.sambhu.dto.SampleRequest;
import com.example.sambhu.dto.SampleResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    public SampleResponse getSampleResponse(SampleRequest sampleRequest){
        //you implementation
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setGetAllDealers(List.of(Dealer.builder().build()));
        return sampleResponse;
    }

}
