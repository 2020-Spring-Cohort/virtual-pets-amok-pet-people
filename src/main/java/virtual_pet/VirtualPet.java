package virtual_pet;

public class VirtualPet {

    private String name;
    private int hunger = 10;

    public VirtualPet(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void feed() {
        hunger -= 3;
        if(hunger < 0){
            hunger = 0;
        }
    }
}
