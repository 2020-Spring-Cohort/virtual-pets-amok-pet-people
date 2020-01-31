package virtual_pet;

abstract class Cyborg extends VirtualAlien {

    public Cyborg(String alienName) {
        super(alienName);
        super.alienType = "Cyborg";
        payAmount = 14;
    }

    public void feed() {
        super.feed();
        System.out.println(getName() + "I eat nuts and bolts");
    }

    @Override
    public void read(){
        super.read();
        System.out.println(getName() + ": I download data to get smarter!");
        }

}
