package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;

@SpringBootApplication
public class DataJpaApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataJpaApplication.class);
	private static EmployeeService empService;
	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);
		empService = context.getBean(EmployeeService.class);
		LOGGER.info("Started");
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Gopisetty Rohith");
		emp.setSalary(150000);
		empService.addEmployee(emp);
		LOGGER.info("END");
		
	}

}
