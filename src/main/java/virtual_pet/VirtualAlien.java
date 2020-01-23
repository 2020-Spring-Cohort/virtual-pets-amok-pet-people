package virtual_pet;

import java.util.Scanner;

public class VirtualAlien {

    String name;
    String alienType;
    int hunger = 10;
    int intelligence = 5;

    public VirtualAlien(String alienName, String alienType) {
        this.name = alienName;
        this.alienType = alienType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return alienType;
    }

    public int getHunger() {
        return hunger;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void tick() {
        hunger += 10;
        intelligence -= 1;
    }
}

