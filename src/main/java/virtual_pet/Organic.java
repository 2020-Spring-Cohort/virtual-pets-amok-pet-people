package virtual_pet;

abstract class Organic extends VirtualAlien {

    public Organic(String alienName) {
        super(alienName);
    }

    public void feed() {
        super.feed();
        System.out.println("I eat food!");
    }
}
