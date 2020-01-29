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
        System.out.println(getName() + ": I got paid: " + payAmount +
                " and an extra " + extraCash + " as a Cyborg Neptunian.");

    }

    @Override
    public String getRace() {
        return alienRace;
    }
}
