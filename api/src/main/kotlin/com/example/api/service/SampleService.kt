package com.example.api.service

import com.example.common.extension.toFormatString
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class SampleService {

    fun sample(): String {
        return LocalDateTime.now().toFormatString("yyyy/MM/dd HH:mm:ss")
    }
}