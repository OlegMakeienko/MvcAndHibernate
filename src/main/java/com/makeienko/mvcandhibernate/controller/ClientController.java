package com.makeienko.mvcandhibernate.controller;

import com.makeienko.mvcandhibernate.entity.Client;
import com.makeienko.mvcandhibernate.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @GetMapping("/")
    @ResponseBody
    public String test() {
        return "test";
    }

    @GetMapping("/clients")
    public List<Client> showAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("clients/{id}")
    public Client getClient(@PathVariable int id) {
        return clientService.getClient(id);
    }

    @PostMapping("/clients")
    public Client addNewClient(@RequestBody Client client) {
        clientService.saveClient(client);
        return client;
    }

    @PutMapping("/clients")
    public Client updateClient(@RequestBody Client client) {
        clientService.saveClient(client);
        return client;
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }
}
