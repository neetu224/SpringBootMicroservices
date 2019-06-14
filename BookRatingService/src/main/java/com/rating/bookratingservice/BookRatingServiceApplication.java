package com.rating.bookratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableEurekaClient
public class BookRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRatingServiceApplication.class, args);
	}

}
