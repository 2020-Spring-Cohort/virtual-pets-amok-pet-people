package virtual_pet;

public class CyborgPlutonian extends Cyborg implements Plutonian {

    public CyborgPlutonian(String alienName) {
        super(alienName);
    }

    @Override
    public void sweetFeed(int extraFood){
        hunger += extraFood;
        System.out.println(getName() + " got fed " + feedAmount +
                " and " + extraFood + " extra food as a Plutonian.");
        System.out.println(" ");
    }

    @Override
    public String getRace() {
        return alienRace;
    }


}
