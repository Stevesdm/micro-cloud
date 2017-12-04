package com.steve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCloudEurekaApplication.class, args);
	}
}
