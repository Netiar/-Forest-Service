package dao;

import models.Animal;
import org.sql2o.Sql2o;

import java.util.List;

public class sql2oAnimalDao implements AnimalDao{

    private final Sql2o sql2o;

    public sql2oAnimalDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<Animal> findAnimal() {
        return null;
    }

    @Override
    public void addAnimal(Animal animal) {

    }

    @Override
    public Animal findAnimalById(int id) {
        return null;
    }

    @Override
    public void deleteAnimalById(int id) {

    }

    @Override
    public void deleteAllAnimals() {

    }

    @Override
    public void deleteAllHeros() {

    }

    @Override
    public int getId() {
        return 0;
    }


}
