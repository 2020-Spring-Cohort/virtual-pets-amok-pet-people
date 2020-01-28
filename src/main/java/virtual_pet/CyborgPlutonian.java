package virtual_pet;

public class CyborgPlutonian extends Cyborg implements Plutonian {

    public CyborgPlutonian(String alienName) {
        super(alienName);
    }

    @Override
    public void sweetFeed(int extraFood){
    }

    @Override
    public String getRace() {
        return alienRace;
    }


}
