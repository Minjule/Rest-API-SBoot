package com.example.demo.client;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClientService {
    public List<Client> getClients(){
        return List.of(
            new Client(67l, "lsji",  "dsfioh@gmail.com", LocalDate.of(2000, Month.MAY, 4), 43)
        );
    }
}
