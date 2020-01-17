package virtual_pet;

import java.util.Scanner;

public class VirtualAlien {

    private String name;
    //this is for cyborg or organic
    private String alienType;

    public VirtualAlien(String alienName) {
        this.name = alienName;
    }

    public String getName() {
        return name;
    }
    public String pickType( String alienType) {
        System.out.println("pick your alien type organic or cyborg");
        Scanner input = new Scanner(System.in);
        String placeholder = input.nextLine();
        if(placeholder == "organic") {
            alienType = placeholder;
            System.out.println("You have chosen an " + alienType + " alien.");
        }
        if (placeholder == "cyborg") {
            alienType = placeholder;
            System.out.println("You have chosen a " + alienType + "alien.");
        }
        else {
            System.out.println("Invalid entry, please follow the directions.");

        }
        return null;
    }

}

