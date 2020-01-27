package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienShelterTest {
    private AlienShelter shelterUnderTest;
    private VirtualAlien underTest;
    private VirtualAlien alienUnderTest2;
    private VirtualAlien alienUnderTest3;

    @BeforeEach
    void setUp() {
        shelterUnderTest = new AlienShelter();
        underTest = new VirtualAlien("Bob", "cyborg");
        shelterUnderTest.addAlien(underTest);
    }

    @Test
    public void shouldBeAbleToAddAlien() {
        ArrayList<VirtualAlien> retrievedAliens = shelterUnderTest.retrieveAliens();
        assertEquals(1, retrievedAliens.size());
    }

    @Test
    public void shouldBeAbleToFeedAlienWithShelterOfOne() {
        shelterUnderTest.feedAllAliens();
        ArrayList<VirtualAlien> fedAliens = shelterUnderTest.retrieveAliens();
        assertEquals(fedAliens.get(0).getHunger(), 2);
    }

    @Test
    public void shouldBeAbleToFeedAlienWithShelterOfTwo() {
        alienUnderTest2 = new VirtualAlien("Joe", "organic");
        shelterUnderTest.addAlien(alienUnderTest2);
        shelterUnderTest.feedAllAliens();
        ArrayList<VirtualAlien> fedAliens = shelterUnderTest.retrieveAliens();
        assertEquals(fedAliens.get(0).getHunger(), 2);
        assertEquals(fedAliens.get(1).getHunger(), 2);
    }
    @Test
    public void shouldBeAbleToSeeList() {
        alienUnderTest2 = new VirtualAlien("Joe", "organic");
        shelterUnderTest.addAlien(alienUnderTest2);
        alienUnderTest3 = new VirtualAlien("Jim", "organic");
        shelterUnderTest.addAlien(alienUnderTest3);
        alienUnderTest3 = new VirtualAlien("Jackson", "organic");
        shelterUnderTest.addAlien(alienUnderTest3);
        shelterUnderTest.printAllAliens();

    }

    @Test
    public void shouldBeAbleToSeeNumberOfPets(){
        alienUnderTest2 = new VirtualAlien("Joe", "organic");
        shelterUnderTest.addAlien(alienUnderTest2);
        alienUnderTest3 = new VirtualAlien("Jim", "organic");
        shelterUnderTest.addAlien(alienUnderTest3);
        alienUnderTest3 = new VirtualAlien("Jackson", "organic");
        shelterUnderTest.addAlien(alienUnderTest3);
        System.out.println("The number of aliens is: " +  shelterUnderTest.numAliensInShelter());

    }
}
