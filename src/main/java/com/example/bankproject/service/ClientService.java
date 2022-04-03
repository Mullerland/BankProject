package com.example.bankproject.service;

import com.example.bankproject.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    public Client add(Client client);

    public List<Client> findClients();

    public Client getClientById(Integer id);

     public void deleteById(Integer id);
}
