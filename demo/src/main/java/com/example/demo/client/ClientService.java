package com.example.demo.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public void addNewClient(Client client){
        Optional<Client> clientByEmail = clientRepository.findClientByEmail(client.getEmail());
        if(clientByEmail.isPresent()){
            throw new IllegalStateException("Burtgeltei mail bna");
        }
        clientRepository.save(client);
    }
}
