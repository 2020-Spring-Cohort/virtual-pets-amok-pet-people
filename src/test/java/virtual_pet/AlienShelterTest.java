package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienShelterTest {
//    private AlienShelter shelterUnderTest;
//    private VirtualAlien underTest;
//    private VirtualAlien alienUnderTest2;
//    private VirtualAlien alienUnderTest3;
//
//    @BeforeEach
//    void setUp() {
//        shelterUnderTest = new AlienShelter();
//        underTest = new VirtualAlien("Bob", "cyborg");
//        shelterUnderTest.addAlien(underTest);
//    }

    @Test
    public void shouldBeAbleToAddAlien() {
        VirtualAlien test1 = new CyborgNeptunian("joe");
        assertEquals("joe", test1.getName());
    }

    @Test
    public void shouldBeAbleToGetAlienRace() {
        VirtualAlien test1 = new CyborgNeptunian("joe");
        assertEquals("Neptunian", test1.getRace());
    }

    @Test
    public void shouldBeAbleToMakeShelterArrayAliens() {
        VirtualAlien test1 = new CyborgNeptunian("joe");
        VirtualAlien test2 = new CyborgPlutonian("john");
        AlienShelter shelterUnderTest = new AlienShelter();
        shelterUnderTest.addAlien(test1);
        shelterUnderTest.addAlien(test2);
        ArrayList<VirtualAlien> alienList = shelterUnderTest.retrieveAliens();
        assertEquals(2, alienList.size());
    }

    @Test
    public void shouldBeAbleToRetrieveAllAliensAndStatus() {
        VirtualAlien test1 = new CyborgNeptunian("joe");
        VirtualAlien test2 = new CyborgPlutonian("john");
        VirtualAlien test3 = new OrganicPlutonian("jim");
        AlienShelter shelterUnderTest = new AlienShelter();
        shelterUnderTest.addAlien(test1);
        shelterUnderTest.addAlien(test2);
        shelterUnderTest.addAlien(test3);
        ArrayList<VirtualAlien> alienList = shelterUnderTest.retrieveAliens();
        shelterUnderTest.printAllAliens();
    }


//    @Test
//    public void shouldBeAbleToFeedAlienWithShelterOfOne() {
//        shelterUnderTest.feedAllAliens();
//        ArrayList<VirtualAlien> fedAliens = shelterUnderTest.retrieveAliens();
//        assertEquals(fedAliens.get(0).getHunger(), 2);
//    }
//
//    @Test
//    public void shouldBeAbleToFeedAlienWithShelterOfTwo() {
//        alienUnderTest2 = new VirtualAlien("Joe", "organic");
//        shelterUnderTest.addAlien(alienUnderTest2);
//        shelterUnderTest.feedAllAliens();
//        ArrayList<VirtualAlien> fedAliens = shelterUnderTest.retrieveAliens();
//        assertEquals(fedAliens.get(0).getHunger(), 2);
//        assertEquals(fedAliens.get(1).getHunger(), 2);
//    }
//    @Test
//    public void shouldBeAbleToSeeList() {
//        alienUnderTest2 = new VirtualAlien("Joe", "organic");
//        shelterUnderTest.addAlien(alienUnderTest2);
//        alienUnderTest3 = new VirtualAlien("Jim", "organic");
//        shelterUnderTest.addAlien(alienUnderTest3);
//        alienUnderTest3 = new VirtualAlien("Jackson", "organic");
//        shelterUnderTest.addAlien(alienUnderTest3);
//        shelterUnderTest.printAllAliens();
//
//    }
//
//    @Test
//    public void shouldBeAbleToSeeNumberOfPets(){
//        alienUnderTest2 = new VirtualAlien("Joe", "organic");
//        shelterUnderTest.addAlien(alienUnderTest2);
//        alienUnderTest3 = new VirtualAlien("Jim", "organic");
//        shelterUnderTest.addAlien(alienUnderTest3);
//        alienUnderTest3 = new VirtualAlien("Jackson", "organic");
//        shelterUnderTest.addAlien(alienUnderTest3);
//        System.out.println("The number of aliens is: " +  shelterUnderTest.numAliensInShelter());
//
//    }
}
