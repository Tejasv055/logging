package com.example.logging.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoggingService {
    public String processLogging() {
        log.info("Processing logging request in service");

        return "Service logging successful";
    }
}
