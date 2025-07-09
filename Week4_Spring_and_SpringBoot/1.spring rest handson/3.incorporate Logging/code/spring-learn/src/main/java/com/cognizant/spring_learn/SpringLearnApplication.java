package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        SpringLearnApplication app = new SpringLearnApplication();
        app.displayDate();
    }

    public void displayDate() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            Date parsedDate = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date: {}", parsedDate);
            System.out.println("Parsed Date: " + parsedDate); // Fallback output
        } catch (ParseException e) {
            LOGGER.error("Error parsing date", e);
        }

        LOGGER.info("END");
    }
}
