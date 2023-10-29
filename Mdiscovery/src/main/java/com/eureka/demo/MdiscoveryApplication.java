package com.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//we are enabling eureka through code
public class MdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdiscoveryApplication.class, args);
	}
}