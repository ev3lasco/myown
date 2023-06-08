package com.newAPI.myown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.newAPI.myown.domain")
public class MyownApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyownApplication.class, args);
	}

}
