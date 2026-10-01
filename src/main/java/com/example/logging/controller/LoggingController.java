package com.example.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    private static final Logger log =
        LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/test")
    public String testLogging() {
        log.info("Test endpoint called");

        return "Logging test successful";
    }

    @GetMapping("/logs")
    public String testLogs() {

        log.debug("This is a DEBUG log");
        log.info("This is an INFO log");
        log.warn("This is a WARN log");
        log.error("This is an ERROR log");

        return "Logs generated";
    }
}
