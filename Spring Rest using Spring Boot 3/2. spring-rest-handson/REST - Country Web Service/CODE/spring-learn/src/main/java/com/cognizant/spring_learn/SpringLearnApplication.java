package com.cognizant.spring_learn;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringLearnApplication {

	 private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringLearnApplication.class);

	    public static void main(String[] args) {
	        SpringApplication.run(SpringLearnApplication.class, args);
	        LOGGER.info("Spring Boot application started");
	    }

}
