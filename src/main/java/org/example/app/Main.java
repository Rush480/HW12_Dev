package org.example.app;

import org.example.app.config.DataSource;


import org.example.app.model.Client;
import org.example.app.model.Planet;
import org.example.app.service.ClientCrudService;
import org.example.app.service.PlanetCrudService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataSource.getConnection();

        PlanetCrudService planetCrudService = new PlanetCrudService();
        ClientCrudService clientCrudService = new ClientCrudService();

        // Create
        Client newClient = new Client();
        newClient.setName("Some name");
        clientCrudService.saveClient(newClient);

        Planet newPlanet = new Planet();
        newPlanet.setName("Uranus");
        planetCrudService.savePlanet(newPlanet);

        // Read
        Client client = clientCrudService.findClientById(1L);
        Planet planet = planetCrudService.findPlanetById("JUP");

        // Update
        client.setName("New name");
        clientCrudService.updateClient(client);
        planet.setName("New planet");
        planetCrudService.updatePlanet(planet);

        // Delete
        clientCrudService.deleteClient(client);
        planetCrudService.deletePlanet(planet);
    }
}
