package models;

import java.util.Date;
import java.util.Objects;

public class Sightings {
    private int animalId;
    private String endangeredAnimal;
    private String location;
    private String rangerName;
    private Date date;


    public int getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    private int createdBy;

    private Date createdAt;

    public Sightings(String animalId, String endangeredAnimal, String location, String rangerName, Date createdAt) {
        this.animalId = Integer.parseInt(animalId);
        this.endangeredAnimal = endangeredAnimal;
        this.location = location;
        this.rangerName = rangerName;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Sightings sightings = (Sightings)  o;
        return animalId == sightings.animalId && Objects.equals(endangeredAnimal, sightings.endangeredAnimal) && Objects.equals(location, sightings.location) && Objects.equals(rangerName, sightings.rangerName) && Objects.equals(createdAt, sightings.createdAt);


    }

    @Override
    public int hashCode() {return Objects.hash(animalId,endangeredAnimal ,location , rangerName, createdAt ); }


}


