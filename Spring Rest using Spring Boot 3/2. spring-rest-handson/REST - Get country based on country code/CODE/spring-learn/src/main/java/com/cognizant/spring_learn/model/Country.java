package com.cognizant.spring_learn.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Country {
	   private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

	    private String code;
	    private String name;

	    // No-arg constructor
	    public Country() {
	        LOGGER.debug("Inside Country Constructor");
	    }

	    // All-arg constructor
	    public Country(String code, String name) {
	        this.code = code;
	        this.name = name;
	        LOGGER.debug("Country created with code = {} and name = {}", code, name);
	    }

	    public String getCode() {
	        LOGGER.debug("Getting code");
	        return code;
	    }

	    public void setCode(String code) {
	        LOGGER.debug("Setting code to {}", code);
	        this.code = code;
	    }

	    public String getName() {
	        LOGGER.debug("Getting name");
	        return name;
	    }

	    public void setName(String name) {
	        LOGGER.debug("Setting name to {}", name);
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Country [code=" + code + ", name=" + name + "]";
	    }
}
