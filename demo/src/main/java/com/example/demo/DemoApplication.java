package com.example.demo;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.client.Client;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Client> show(){
		return List.of(
			new Client(67l, "lsji",  "dsfioh@gmail.com", LocalDate.of(2000, Month.MAY, 4), 43)
		);
	};

}
