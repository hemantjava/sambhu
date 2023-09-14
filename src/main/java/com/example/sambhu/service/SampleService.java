package com.example.sambhu.service;

import com.example.sambhu.dto.SampleRequest;
import com.example.sambhu.dto.SampleResponse;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public SampleResponse getSampleResponse(SampleRequest sampleRequest){
        //you implementation
        return new SampleResponse();
    }

}
