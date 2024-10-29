package org.example.app.service;

import org.example.app.dao.PlanetDao;
import org.example.app.model.Planet;

import java.util.Random;


public class PlanetCrudService {
    private PlanetDao planetDao = new PlanetDao();
    private Random random = new Random();
    public void savePlanet(Planet planet) {
        if (planet == null) {
            throw new IllegalArgumentException("Planet cannot be null");
        }
        String name = planet.getName();
        String id = name.substring(0, 3).toUpperCase() + generateRandomNumber();
        planet.setId(id);
        planetDao.save(planet);
    }

    private String generateRandomNumber() {
        int randomNumber = random.nextInt(999);
        return String.format("%06d", randomNumber);
    }

    public Planet findPlanetById(String id) {
        if (!checkId(id)) {
            throw new IllegalArgumentException("Invalid planet id. Id should only contain uppercase letters and numbers.");
        }
        try {
            return planetDao.findById(id);
        } catch (RuntimeException e) {
            throw new RuntimeException("Failed to find planet", e);
        }
    }

    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }

    public void deletePlanet(Planet planet) {
        planetDao.delete(planet);
    }

    private boolean checkId(String id) {
        return id.matches("^[A-Z0-9]+$");
    }
}
