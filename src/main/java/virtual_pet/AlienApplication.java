package virtual_pet;

import java.util.Scanner;

public class AlienApplication {


    public static void main(String[] args) {

        System.out.println("Welcome to the Virtual Alien Game");
        System.out.println("press 1 to create a new Alien");
        Scanner input = new Scanner(System.in);
        int create = input.nextInt();
        if(create == 1){
            VirtualAlien alien = new VirtualAlien();
        }
        chooseName();
        pickType();
    }

        public static void chooseName(){
        System.out.println("Please choose your Alien name");
        Scanner input = new Scanner(System.in);
        String alienName = input.nextLine();

        System.out.println("you have chosen your name: " + alien.getName());
    }
    public static void pickType(){
        System.out.println(" Please choose between cyborg or organic.");
        Scanner input = new Scanner(System.in);
        pickType(input);

    }




}