package virtual_pet;
public abstract class VirtualAlien {

    String name;
    String alienType;
    int hunger = 5;
    int intelligence = 5;
    protected int payAmount = 3;
    protected int finances = 5;

    public VirtualAlien(String alienName) {
        this.name = alienName;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return alienType;
    }

    public String getRace(){
        return "not made yet";
    }

    public int getHunger() {
        return hunger;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void tick() {
        hunger += 1;
        if (hunger > 10) {
            hunger = 10;
        }
        intelligence -= 1;
        if (intelligence < 0) {
            intelligence = 0;
        }
        finances -= 1;
        if (finances < 0) {
            finances = 0;
        }
    }

    public int getFinances() {
        return finances;
    }

    public void feed() {
        hunger -= 3;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void read() {
        intelligence += 4;
        if (intelligence > 10) {
            intelligence = 10;
        }
        System.out.println(getName() + ": Reading books makes me smart.");
    }

    public void acquireMoney() {
        finances += payAmount;
        if (finances > 10) {
            finances = 10;
        }
    }
}

