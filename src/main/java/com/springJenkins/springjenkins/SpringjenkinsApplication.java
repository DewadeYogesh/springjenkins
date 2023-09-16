package com.springJenkins.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("home")
public class SpringjenkinsApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplication.class);
@PostConstruct
	public void init(){
		logger.info("Application Started");
	}

	public static void main(String[] args) {
	logger.info("Application Executed");
		SpringApplication.run(SpringjenkinsApplication.class, args);
	}
@GetMapping("welcome")
	public String getMessage(){
		return "welcome you successed";
	}
}
