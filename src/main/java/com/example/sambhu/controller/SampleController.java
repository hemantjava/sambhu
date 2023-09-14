package com.example.sambhu.controller;

import com.example.sambhu.dto.SampleRequest;
import com.example.sambhu.dto.SampleResponse;
import com.example.sambhu.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class SampleController {
    private final SampleService service;

    @PostMapping("/")
    public ResponseEntity<SampleResponse> getSample(@RequestBody SampleRequest sampleRequest){
        return ResponseEntity.ok(service.getSampleResponse(sampleRequest));
    }
}
