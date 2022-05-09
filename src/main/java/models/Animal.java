package models;

import java.util.Date;
import java.util.Objects;

public class Animal  {
    private int id;
    private String animalName;
    private String animalType;
    private String age;
    private String health;

    public int getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    private int createdBy;

    private Date createdAt;

    public Animal(String animalName, String animalType, String age, String health, int createdBy, Date createdAt) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.age = age;
        this.health = health;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && createdBy == animal.createdBy && createdAt.equals(animal.createdAt) && animalName.equals(animal.animalName) && animalType.equals(animal.animalType) && age.equals(animal.age) && health.equals(animal.health);

    }

    @Override
    public int hashCode() {return Objects.hash(animalName, age, animalType, health); }

    public int getId() {
        return id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAge() {
        return age;
    }

    public String getHealth() {
        return health;
    }


    public void setId(int id) {
        this.id = id;
    }
}

