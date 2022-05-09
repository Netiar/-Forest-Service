package models;

import java.util.Date;

public class Animals implements dao.Animals {
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

    public Animals(String animalName, String animalType, String age, String health, int createdBy, Date createdAt) {
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
        Animals animals = (Animals) o;
        return id == animals.id && createdBy == animals.createdBy && createdAt.equals(animals.createdAt) && animalName.equals(animals.animalName) && animalType.equals(animals.animalType) && age.equals(animals.age) && health.equals(animals.health);

    }
     @Override
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


}
