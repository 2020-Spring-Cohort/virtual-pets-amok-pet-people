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

    @Test
    public void organicShouldReadToGetSmarter() {
        Organic alien1 = new OrganicNeptunian("Joe");
        System.out.println(alien1.getIntelligence());
        alien1.read();
        System.out.println(alien1.getIntelligence());
    }

//    @Test
//    public void neptunianShouldGetSweetPay() {
//        CyborgNeptunian alien1 = new CyborgNeptunian("Joe");
//        System.out.println(alien1.getFinances());
//        alien1.sweetPay(5);
//        System.out.println(alien1.getFinances());
//    }

    @Test
    public void ifNeptunianSpecifySweetCash() {
        CyborgNeptunian alien1 = new CyborgNeptunian("Joe");
        System.out.println(alien1.getFinances());
        alien1.acquireMoney();
        System.out.println(alien1.getFinances());
    }

    @Test
    public void shouldCreateCyborgPlutonian() {
        CyborgPlutonian alien1 = new CyborgPlutonian("Joe");
        System.out.println(alien1.getName());
        System.out.println(alien1.getType());
        System.out.println(alien1.getRace());
    }

    @Test
    public void shouldCreateCyborgNeptunian() {
        CyborgNeptunian alien1 = new CyborgNeptunian("Joe");
        OrganicPlutonian alien2 = new OrganicPlutonian("Jim");
        System.out.println(alien1.getName());
        System.out.println(alien1.getType());
        System.out.println(alien1.getRace());
        System.out.println("\n");
        System.out.println(alien2.getName());
        System.out.println(alien2.getType());
        System.out.println(alien2.getRace());
    }

}
