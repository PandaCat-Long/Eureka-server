package com.roncoo.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		System.out.println("halo!");
                System.out.println("halo!");
		System.out.println("halo!");
		SpringApplication.run(EurekaServer.class, args);
	}
	
}
