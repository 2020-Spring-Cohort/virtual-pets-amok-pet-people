package virtual_pet;

import org.junit.jupiter.api.Test;

public class AlienShelterTest {

    @Test
    public void shouldBeAbleToAddAlien() {
        AlienShelter shelter = new AlienShelter();
        shelter.addAlien();
    }
}
