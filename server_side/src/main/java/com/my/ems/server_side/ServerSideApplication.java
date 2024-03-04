package com.my.ems.server_side;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSideApplication.class, args);
		System.out.println("connection established");
	}

}
