package org.abhi.myservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyServiceApplication {

	public static void main(String[] args) {
		System.out.println("Starting app...");
		SpringApplication.run(MyServiceApplication.class, args);
		System.out.println("App started...");
	}

}
