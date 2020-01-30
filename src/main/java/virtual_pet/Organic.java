package virtual_pet;

abstract class Organic extends VirtualAlien {

    public Organic(String alienName) {
        super(alienName);
        super.alienType = "Organic";
    }

    public void feed() {
        super.feed();
        System.out.println(name + ": I eat real food!");
    }

    public void read(){
        super.read();
        System.out.println(getName() + ": Reading books makes me smart.");

}
}
