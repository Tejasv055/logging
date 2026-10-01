package com.example.logging.controller;

import com.example.logging.service.LoggingService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoggingController {
    private final LoggingService loggingService;
//
//    public LoggingController (final LoggingService loggingService) {
//        this.loggingService = loggingService;
//    }

    @GetMapping("/test")
    public String testLogging() {
        return loggingService.processLogging();

    }

    @GetMapping("/logs")
    public String testLogs() {

        return loggingService.processLogging();
    }
}
