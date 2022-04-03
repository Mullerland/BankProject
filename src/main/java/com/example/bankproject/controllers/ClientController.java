package com.example.bankproject.controllers;

import com.example.bankproject.entity.Client;
import com.example.bankproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients/")
public class ClientController {

    private final ClientService clientService;

    public ClientController(@Autowired ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(path = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Client add(@RequestBody Client client)
    {
        Client clientResponse = clientService.add(client);
    return clientResponse;
    }

    @GetMapping(path = "/get")
    public List<Client> getAllClients() {
        List<Client> clientList = clientService.findClients();
        return clientList;

    }

    @GetMapping(path = "/get/{id}")
    public Client getById(@PathVariable Integer id) {
        return clientService.getClientById(id);
    }

    @PostMapping(path = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        clientService.deleteById(id);
    }
}


