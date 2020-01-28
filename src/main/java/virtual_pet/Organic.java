package virtual_pet;

abstract class Organic extends VirtualAlien {

    public Organic(String alienName) {
        super(alienName);
        super.alienType = "Organic";
    }

    public void feed() {
        super.feed();
        System.out.println("I eat food!");
    }

    public void read(){
        super.read();
        System.out.println("Because I am organic.");
    }
}
