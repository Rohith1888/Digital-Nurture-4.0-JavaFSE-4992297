package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		// displayDate();
		displayCountry();
		
	}
	public static void displayDate() {
	

       LOGGER.info("START");   
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

       
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            
            Date date = format.parse("13/07/2025");
           
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Failed to parse date: " + e.getMessage());
        }
        LOGGER.info("END");
    }
	
	 public static void displayCountry() {
	        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	        Country country = context.getBean("country", Country.class);
	        LOGGER.debug("Country : {}", country.toString());
	    }

}
