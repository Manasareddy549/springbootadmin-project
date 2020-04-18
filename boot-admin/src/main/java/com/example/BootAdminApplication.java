package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import de.codecentric.boot.admin.server.config.EnableAdminServer;



@SpringBootApplication
@Configuration
@EnableAdminServer

public class BootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminApplication.class, args);
	}
	
}
