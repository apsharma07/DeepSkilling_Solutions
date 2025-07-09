package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    // Static reference to CountryService
    private static CountryService countryService;

    public static void main(String[] args) {

        // Start Spring Boot app and get the application context
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        // Get the CountryService bean from the context
        countryService = context.getBean(CountryService.class);

        // Test method to print all countries
        testGetAllCountries();
    }

    // Test method to fetch all countries using the service
    private static void testGetAllCountries() {
        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);

        LOGGER.info("End");
    }
}
