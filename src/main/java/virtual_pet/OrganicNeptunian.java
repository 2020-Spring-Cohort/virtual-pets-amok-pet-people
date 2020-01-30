package virtual_pet;

public class OrganicNeptunian extends Organic implements Neptunian {

    //Should come from interface
    // public static String alienRace = "Neptunian";

    public OrganicNeptunian(String alienName) {
        super(alienName);

    }
    @Override
    public void sweetPay(int extraCash) {
        finances += extraCash;
    }

    @Override
    public String getRace() {
        return alienRace;
    }


}
