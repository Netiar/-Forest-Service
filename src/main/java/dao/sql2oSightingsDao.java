package dao;

import models.Sightings;

import java.util.List;

public class sql2oSightingsDao implements SightingsDao {


    @Override
    public List<Sightings> getAllSightings() {
        return null;
    }

    @Override
    public void addSightings(Sightings sightings) {

    }

    @Override
    public Sightings findSightingsById(int id) {
        return null;
    }

    @Override
    public List<Sightings> getSightingsByLocation(String location) {
        return null;
    }

    @Override
    public List<Sightings> getSightingsByDate(String date) {
        return null;
    }

    @Override
    public List<Sightings> getEndangeredSpecies() {
        return null;
    }

    @Override
    public void deleteSightingsById(String id) {

    }

    @Override
    public void deleteAllSightings() {

    }
}
