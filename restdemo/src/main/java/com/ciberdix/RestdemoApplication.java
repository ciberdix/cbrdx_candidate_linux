package com.ciberdix;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootConfiguration
public class RestdemoApplication {

	@Autowired
	EmployeeRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}
	
	@PostConstruct
	private void init(){
		Employee employee = new Employee();
		employee.setFirstName("Bilbo");
		employee.setLastName("Baggins");
		employee.setTitle("thief");
		repository.save(employee);
	}
}
