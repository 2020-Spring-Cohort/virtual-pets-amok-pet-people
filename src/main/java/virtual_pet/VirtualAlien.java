package virtual_pet;

import java.util.Scanner;

public class VirtualAlien {

    private String name;
    //this is for cyborg or organic
    private String alienType;

    public VirtualAlien() {

    }


    public String chooseName(String alienName) {
        this.name = alienName;
        return alienName;
    }

    public String getName() {
        return name;
    }

    public String pickType(String userAlienType) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("pick your alien type organic or cyborg");
//        String userAlienType = input.nextLine();

        if(userAlienType == "organic") {
            this.alienType = "organic";
            System.out.println("You have chosen an " + alienType + " alien.");
        }
        if (userAlienType == "cyborg") {
            this.alienType = "cyborg";
            System.out.println("You have chosen a " + alienType + " alien.");
        }
        else {
            System.out.println("Invalid entry, please follow the directions.");

        }
        return alienType;
    }

}

