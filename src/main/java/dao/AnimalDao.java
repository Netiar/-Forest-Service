package dao;

import models.Animal;

import java.util.List;



public interface AnimalDao {

    // list animals
    List<Animal> findAnimal();

    // Create a new animal
    void addAnimal(Animal animal);

    // get a specific animal
    Animal findAnimalById(int id);

    // Delete an animal
    void deleteAnimalById( int id);


    //Delete all animals
    void deleteAllAnimals();

    // Update an animal
    void updateAnimal(Animal animal);


}
