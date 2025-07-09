package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        SpringLearnApplication app = new SpringLearnApplication();
        app.displayCountry();
    }

    public void displayCountry() {
    	LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList = context.getBean("countryList", ArrayList.class);

        LOGGER.info("Country List: {}", countryList);

        LOGGER.info("END");
    }
}
