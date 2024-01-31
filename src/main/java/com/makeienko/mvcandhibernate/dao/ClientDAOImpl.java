package com.makeienko.mvcandhibernate.dao;

import com.makeienko.mvcandhibernate.entity.Client;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO {

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Client> getAllClients() {
        Session session = entityManager.unwrap(Session.class);
        Query<Client> clientQuery = session.createQuery("FROM Client" , Client.class);
        return clientQuery.getResultList();
    }

    @Override
    public void saveClient(Client client) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(client);
    }

    @Override
    public Client getClient(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Client.class, id);
    }


    @Override
    public void deleteClient(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Client> clientQuery = session.createQuery("delete FROM Client where id =:client_id" , Client.class);
        clientQuery.setParameter("client_id", id);
        clientQuery.executeUpdate();
    }
}
