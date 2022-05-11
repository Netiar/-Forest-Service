package dao;

import models.Animal;

import java.util.List;



public interface AnimalDao {


    List<Animal> animal = getAllAnimal();

    static List<Animal> getAllAnimal() {
        return animal;
    }

    static void addAnimal(Animal newAnimal) {
    }

    static Animal findAnimalById(int idd) {
        return null;
    }

    static void deleteAnimalById(int idOfAnimalToDeleteToDelete) {
    }

    static void deleteAllAnimals() {
    }

    // list animals
    List<Animal> findAnimal();

    // Create a new animal


//    static void addAnimal(Animal animal) {
//        animal.add(animal);
//    }
//
//    void addAnimal(Animal animal);
//
//    // get a specific animal
//    static Animal findAnimalById(int id) {
//        return null;
//    }
//
//    Animal findAnimalById(int id);
//
//    // Delete an animal
//    static void deleteAnimalById(int id);
//
//
//    void deleteAnimalById(int id);
//
//    //Delete all animals
//    static void deleteAllAnimals() {
//        return null;
//    }
//
//    void deleteAllAnimals();
//
//    // Update an animal
//    void updateAnimal(Animal animal);
//

}
