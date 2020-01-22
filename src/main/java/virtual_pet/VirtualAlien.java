package virtual_pet;

import java.util.Scanner;

public class VirtualAlien {

    String name;
    String alienType;

    public VirtualAlien(String alienName, String alienType) {
        this.name = alienName;
        this.alienType = alienType;
    }

//    public String setType(String alienType) {
//
//
//        //this.alienType = alienType;
////        if(alienType == "organic") {
////            String userType = alienType;
////            System.out.println("You have chosen an " + alienType + " alien.");
////            return userType;
//        }

        public String getName() {
            return name;
        }
        public String getType() {
            return alienType;
        }
}

