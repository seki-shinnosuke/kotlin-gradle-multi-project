package com.example.api.controller

import com.example.api.model.response.SampleResponse
import com.example.api.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) {

    @GetMapping("/api/sample")
    fun sample(): SampleResponse {
        return SampleResponse(
            message = sampleService.sample()
        )
    }
}