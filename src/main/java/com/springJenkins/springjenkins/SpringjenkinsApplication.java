package com.springJenkins.springjenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@RequestMapping("home")
public class SpringjenkinsApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplication.class);

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
