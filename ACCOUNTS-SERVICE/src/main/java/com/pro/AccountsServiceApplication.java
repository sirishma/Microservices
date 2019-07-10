package com.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AccountsServiceApplication {

	public static void main(String[] args) {
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		SpringApplication.run(AccountsServiceApplication.class, args);
	}

}
