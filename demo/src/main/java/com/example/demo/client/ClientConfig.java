package com.example.demo.client;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner commandLineRunner( ClientRepository repository ){
        return args -> {
            Client C = new Client(290l, "ClientC", "ClientC@gmail.com", LocalDate.of(2000, Month.JANUARY, 2), 23);
            Client D = new Client(560l, "ClientD", "ClientD@gmail.com", LocalDate.of(2003, Month.MAY, 17), 20);
            repository.saveAll(List.of(C, D));
        };
    }
    
}
