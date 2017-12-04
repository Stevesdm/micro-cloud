package com.steve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroCloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCloudApiGatewayApplication.class, args);
	}
}
