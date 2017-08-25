package com.eur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@Configuration
//@EnableAutoConfiguration
@EnableEurekaServer
@SpringBootApplication
public class Application {

	/*@RequestMapping("/test")
	public String home(){
		return "Hello World";
	}*/
	public static void main(String[] args){
		SpringApplication.run(Application.class,args);
	}
}
