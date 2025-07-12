package com.cognizant.spring_learn.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class HelloController {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("Start sayHello()");
        LOGGER.info("End sayHello()");
        return "Hello World!!";
    }
}
