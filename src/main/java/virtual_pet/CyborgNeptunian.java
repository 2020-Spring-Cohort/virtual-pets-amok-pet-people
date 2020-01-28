package virtual_pet;

public class CyborgNeptunian extends Cyborg implements Neptunian{

    // Should come from interface
   // public static String alienRace = "Neptunian";

    int extraCash = 0;

    public CyborgNeptunian(String alienName) {
        super(alienName);
    }

    @Override
   public void acquireMoney(){
        super.acquireMoney();
        System.out.println("I got paid: " + payAmount + " as a Cyborg Neptunian.");
        sweetPay(extraCash);
   }

    @Override
    public void sweetPay(int extraCash) {
        finances += extraCash;
        System.out.println("I got an extra " + extraCash + " cash from sweet pay.");

    }

    @Override
    public String getRace() {
        return alienRace;
    }
}
