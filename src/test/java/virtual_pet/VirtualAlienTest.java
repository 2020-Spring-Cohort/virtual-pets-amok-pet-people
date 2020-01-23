package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualAlienTest {

    @Test
    public void shouldBeAbleToCreateAlien() {
        VirtualAlien underTest = new VirtualAlien("john", "organic");
        System.out.println(underTest.getName());
    }

    @Test
    public void shouldBeAbleToNameAlien(){
        VirtualAlien underTest = new VirtualAlien("John", "organic");
        String result = underTest.getName();
        System.out.println("You have created a virtual alien named " + result);
        assertEquals("John", result);
    }

    @Test
    public void shouldBeAbleToPickAlienType() {
        String result;
        VirtualAlien underTest = new VirtualAlien("john", "organic");
        result = underTest.getType();
                assertEquals("organic", result);
    }

    @Test
    public void shouldBeAbleToPickAlienType2() {
        String result;
        VirtualAlien underTest = new VirtualAlien("john", "cyborg");
        result = underTest.getType();
        assertEquals("cyborg", result);
    }

    @Test
    public void petShouldHaveDefaultHungerTen() {
        VirtualAlien underTest = new VirtualAlien("bob", "cyborg");
        int result = underTest.getHunger();
        assertEquals(10, result);
    }

    @Test
    public void petShouldHaveDefaultIntelligenceFive() {
        VirtualAlien underTest = new VirtualAlien("bob", "cyborg");
        int result = underTest.getIntelligence();
        assertEquals(5, result);
    }

    @Test
    public void shouldTickHunger() {
        VirtualAlien underTest = new VirtualAlien("bob", "cyborg");
        int initialHunger = underTest.getHunger();
        underTest.tick();
        int newHunger = underTest.getHunger();

        assertEquals(initialHunger + 10, newHunger);
    }

    @Test
    public void shouldTickIntelligence() {
        VirtualAlien underTest = new VirtualAlien("bob", "cyborg");
        int initialIntelligence = underTest.getIntelligence();
        underTest.tick();
        int newIntelligence = underTest.getIntelligence();

        assertEquals(initialIntelligence - 1, newIntelligence);
    }
}

