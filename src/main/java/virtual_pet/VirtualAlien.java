package virtual_pet;
public abstract class VirtualAlien {

    protected String name;
    protected String alienType;
    protected int hunger = 25;
    protected int intelligence = 25;
    protected int payAmount = 11;
    protected int feedAmount = 7;
    protected int finances = 25;

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
        hunger += 3;
        if (hunger > 50) {
            hunger = 50;
        }
        if(hunger > 40){
            System.out.println(name + " is starving broh!");
        }
        intelligence -= 4;
        if (intelligence < 0) {
            intelligence = 0;
        }
        if (intelligence <= 10){
            System.out.println(name + " is getting real dumb!");
        }
        finances -= 5;
        if (finances < 0) {
            finances = 0;
        }
        if(finances <=10){
            System.out.println(name + " is broke, send them to work!");
        }
    }


    public int getFinances() {
        return finances;
    }

    public void feed() {
        hunger -= feedAmount;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void read() {
        intelligence += 9;
        if (intelligence > 50) {
            intelligence = 50;
        }
    }

    public void acquireMoney() {
        finances += payAmount;
        if (finances > 50) {
            finances = 50;
        }
    }
}

