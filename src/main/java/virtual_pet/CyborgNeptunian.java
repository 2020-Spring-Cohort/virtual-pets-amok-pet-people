package virtual_pet;

public class CyborgNeptunian extends Cyborg implements Neptunian{

    // Should come from interface
   // public static String alienRace = "Neptunian";

    int extraCash;

    public CyborgNeptunian(String alienName) {
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
