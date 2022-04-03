package com.example.bankproject.service;

import com.example.bankproject.entity.Client;
import com.example.bankproject.repository.ClientRepository;
import com.example.bankproject.repository.CreditRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;
    private final CreditRepository creditRepository;

    public ClientServiceImpl(ClientRepository clientRepository, CreditRepository creditRepository) {
        this.clientRepository = clientRepository;
        this.creditRepository = creditRepository;
    }


    @Override
    public Client add(Client client) {

        return clientRepository.save(client);

    }

    @Override
    public List<Client> findClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Integer id) {
        Client client = clientRepository.findById(id).get();

        return client;

    }

    @Override
    public void deleteById(Integer id) {
        clientRepository.deleteById(id);

    }
}
