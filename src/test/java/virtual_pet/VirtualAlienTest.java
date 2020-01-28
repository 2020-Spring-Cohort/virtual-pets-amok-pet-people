//package virtual_pet;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class VirtualAlienTest {
//
//    private VirtualAlien underTest;
//
//    @BeforeEach
//    void setUp() {
//        underTest = new VirtualAlien("bob", "cyborg");
//    }
//
//    @Test
//    public void shouldBeAbleToCreateAlien() {
//        VirtualAlien underTest = new VirtualAlien("john", "organic");
//        System.out.println(underTest.getName());
//    }
//
//    @Test
//    public void shouldBeAbleToNameAlien() {
//        VirtualAlien underTest = new VirtualAlien("John", "organic");
//        String result = underTest.getName();
//        System.out.println("You have created a virtual alien named " + result);
//        assertEquals("John", result);
//    }
//
//    @Test
//    public void shouldBeAbleToPickAlienType() {
//        String result;
//        VirtualAlien underTest = new VirtualAlien("john", "organic");
//        result = underTest.getType();
//        assertEquals("organic", result);
//    }
//
//    @Test
//    public void shouldBeAbleToPickAlienType2() {
//        String result;
//        VirtualAlien underTest = new VirtualAlien("john", "cyborg");
//        result = underTest.getType();
//        assertEquals("cyborg", result);
//    }
//
//    @Test
//    public void petShouldHaveDefaultHungerTen() {
//        int result = underTest.getHunger();
//        assertEquals(10, result);
//    }
//
//    @Test
//    public void petShouldHaveDefaultIntelligenceFive() {
//        int result = underTest.getIntelligence();
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void shouldTickHunger() {
//        int initialHunger = underTest.getHunger();
//        underTest.tick();
//        int newHunger = underTest.getHunger();
//
//        assertEquals(initialHunger + 1, newHunger);
//    }
//
//    @Test
//    public void shouldTickIntelligence() {
//        int initialIntelligence = underTest.getIntelligence();
//        underTest.tick();
//        int newIntelligence = underTest.getIntelligence();
//
//        assertEquals(initialIntelligence - 1, newIntelligence);
//    }
//
//    @Test
//    public void shouldTickFinances() {
//        int initialFinances = underTest.getFinances();
//        underTest.tick();
//        int newFinances = underTest.getFinances();
//
//        assertEquals(initialFinances - 1, newFinances);
//    }
//
//    @Test
//    public void shouldBeAbleToFeed() {
//        int initialHunger = underTest.getHunger();
//        underTest.feed();
//        int newHunger = underTest.getHunger();
//
//        assertEquals(initialHunger -3, newHunger);
//    }
//
//    @Test
//    public void shouldBeToReadABook() {
//        int initialIntelligence = underTest.getIntelligence();
//        underTest.read();
//        int newIntelligence = underTest.getIntelligence();
//
//        assertEquals(initialIntelligence + 4, newIntelligence);
//    }
//
//    @Test
//    public void shouldBeToAbleMakeMoney() {
//        int initialFinances = underTest.getFinances();
//        underTest.acquireMoney();
//        int newFinances = underTest.getFinances();
//
//        assertEquals(initialFinances + 3, newFinances);
//    }
//
//    @Test
//    public void hungerShouldntBeUnderZero() {
//        int initialHunger = underTest.getHunger();
//        underTest.feed();
//        System.out.println(underTest.getHunger());
//        underTest.feed();
//        System.out.println(underTest.getHunger());
//        underTest.feed();
//        System.out.println(underTest.getHunger());
//        underTest.feed();
//        System.out.println(underTest.getHunger());
//        underTest.feed();
//        System.out.println(underTest.getHunger());
//    }
//
//    @Test
//    public void hungerShouldntBeOverTen() {
//        int initialHunger = underTest.getHunger();
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//        underTest.tick();
//        System.out.println(underTest.getHunger());
//    }
//
//    @Test
//    public void intelligenceShouldntBeUnderZero() {
//        for (int i = 0; i < 10; i++){
//            underTest.tick();
//            System.out.println(underTest.getIntelligence());
//
//
//        }
//    }
//}
//
