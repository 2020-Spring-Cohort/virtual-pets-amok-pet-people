package virtual_pet;

abstract class Cyborg extends VirtualAlien {

    public Cyborg(String alienName) {
        super(alienName);
        super.alienType = "Cyborg";
    }

    public void feed() {
        super.feed();
        System.out.println("I eat nuts and bolts");
    }

    @Override
    public void read(){
        System.out.println(getName() + ": I download data to get smarter!");
        intelligence += 4;
        if (intelligence > 10) {
            intelligence = 10;
        }
    }
}
