package virtual_pet;

import org.junit.jupiter.api.Test;

public class SuperClassTesting {

    @Test
    public void shouldBeAbleToFeedNutsAndBolts(){
        Cyborg alien1 = new CyborgNeptunian("Joe");
        System.out.println(alien1.getHunger());
        alien1.feed();
        System.out.println(alien1.getHunger());
    }

    @Test
    public void cyborgShouldDownloadDataToGetSmarter() {
        Cyborg alien1 = new CyborgNeptunian("Joe");
        System.out.println(alien1.getIntelligence());
        alien1.read();
        System.out.println(alien1.getIntelligence());
    }
}
