import models.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {



    @Test
    public void animal_instantiatesCorrectly_true() {
        Animal animal = new Animal("Lion", "carnivore","adult","healthy", "netiar", "14.00HRS 6/7/2019" );
        assertEquals(true, animal instanceof Animal);
    }



}
