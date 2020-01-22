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
}
