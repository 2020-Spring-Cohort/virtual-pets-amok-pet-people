package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("Steve");
    }

    @Test
    public void shouldBeAbleToCreateVirtualPet(){
        VirtualPet underTest = new VirtualPet("BOB");
    }

    @Test
    public void petShouldHaveName(){
        VirtualPet underTest = new VirtualPet("BOB");
        String result = underTest.getName();
        assertEquals("BOB", result);
    }

    @Test
    public void petShouldHaveHungerSetToTenByDefault(){
        int result = underTest.getHunger();
        assertEquals(10, result);
    }

    @Test
    public void feedingPetShouldDecreaseHungerBy3(){
        underTest.feed();
        int result = underTest.getHunger();
        assertEquals(7, result);
    }

    @Test
    public void feedingAPetShouldNotDecreaseHungerBelow0(){
        for (int i=0; i<5; i++){
            underTest.feed();
        }
        int result = underTest.getHunger();
        assertEquals(0, result);
    }
}
