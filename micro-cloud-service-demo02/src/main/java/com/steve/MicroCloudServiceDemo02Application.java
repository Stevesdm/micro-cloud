package com.steve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroCloudServiceDemo02Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroCloudServiceDemo02Application.class, args);
	}
}
