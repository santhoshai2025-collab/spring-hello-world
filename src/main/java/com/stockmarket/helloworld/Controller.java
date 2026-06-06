package com.stockmarket.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")   // <-- Correct place for path
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @GetMapping("/message")
    public String getMessage() {
        logger.info("Endpoint /api/message was called successfully");
        return "Hello World";
    }
}

