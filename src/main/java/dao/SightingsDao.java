package dao;

import models.Sightings;

import java.util.List;

public interface SightingsDao {

    //list all sightings
    List<Sightings> getAllSightings();

    //create
    List<Sightings> addSightings(Sightings sightings);

    //find by id
    Sightings findSightingsById(int id);

    //get all sightings by location
    List<Sightings> getSightingsByLocation(String location);

    //get all sightings by date
    List<Sightings> getSightingsByDate(String date);

    //get all endangered species
    List<Sightings> getEndangeredAnimal();

    //get all endangered rangers by name
    List<Sightings> getEndangeredRangersByName(String name);

    //delete sightings by id
    void deleteSightingsById(String id);

    //delete all sightings
    void deleteAllSightings();
}