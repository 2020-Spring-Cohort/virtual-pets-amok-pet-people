package virtual_pet;

abstract class Cyborg extends VirtualAlien {

    public Cyborg(String alienName) {
        super(alienName);
    }

    public void feed() {
        super.feed();
        System.out.println("I eat nuts and bolts");
    }

    @Override
    public void read(){
        intelligence += 4;
        if (intelligence > 10) {
            intelligence = 10;
        }
        System.out.println("I download data to get smarter!");
    }

}
