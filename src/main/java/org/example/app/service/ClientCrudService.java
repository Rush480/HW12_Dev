package org.example.app.service;


import org.example.app.dao.ClientDao;
import org.example.app.model.Client;


public class ClientCrudService {
    private ClientDao clientDao = new ClientDao();


    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public Client findClientById(Long id) {
        return clientDao.findById(id);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }

}



