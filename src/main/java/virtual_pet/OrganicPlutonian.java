package virtual_pet;

public class OrganicPlutonian extends Organic implements Plutonian {

    //Should come from interface
    // public static String alienRace = "Neptunian";

    public OrganicPlutonian(String alienName) {
        super(alienName);
    }
    @Override
    public void sweetFeed(int extraFood){
        finances += extraFood;
    }

    @Override
    public String getRace() {
        return alienRace;
    }


}
