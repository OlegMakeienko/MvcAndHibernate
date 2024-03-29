package com.makeienko.mvcandhibernate.dao;

import com.makeienko.mvcandhibernate.entity.Client;

import java.util.List;

public interface ClientDAO {
    public List<Client> getAllClients();
    public void saveClient (Client client);
    public Client getClient (int id);
    public void deleteClient (int id);
}
