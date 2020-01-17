package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualAlienTest {

    @Test
    public void shouldBeAbleToCreateAlien() {
        VirtualAlien underTest = new VirtualAlien("Alien");
        System.out.println(underTest.getName());
    }

    @Test
    public void shouldBeAbleToNameAlien(){
        VirtualAlien underTest = new VirtualAlien("John");
        String result = underTest.getName();
////        System.out.println("You have created a virtual alien named " + VirtualAlien());
        assertEquals("John", result);
    }

    @Test
    public void shouldBeAbleToPickAlienType() {
        VirtualAlien underTest = new VirtualAlien("John");
        String result = underTest.pickType();
    }
}
