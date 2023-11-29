package com.example.demo;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.Client;

@RestController
public class DemoReceiver {

    @RequestMapping
    public List<Client> hello(){
        return List.of(
			new Client(67l, "lsji",  "dsfioh@gmail.com", LocalDate.of(2000, Month.MAY, 4), 43)
		);
    }
}
