package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class AlienApplication {

    private static AlienShelter alienShelter = new AlienShelter();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Open the game and present the initialization menu
        System.out.println("Welcome to the Virtual Alien Game");
        System.out.println("Press 1 to begin, or 0 to exit.");
        int menuInput = userInput(input);

        //Initialization Menu Loop
        while (menuInput !=0){
            System.out.println("Main Menu (press 9 for options)");

            int menu = userInput(input);
            input.nextLine();

            // 0 -- EXIT
            if(menu == 0){
                System.out.println("Goodbye!");
                menuInput = 0;
            }

        //Main Menu Loop
        while(menu!=0) {
            if(menu == 2 ||  menu == 3 || menu == 5){
                alienShelter.tickAll();
            }
            switch (menu) {
                // 1 -- Add Alien to Shelter
                case 1:
                System.out.println("Great, let's make an alien.");

                createAlien();

                menu = 0;
                break;
                // 2 -- Affect All Aliens
                case 2:
                takeActionOnAll();

                menu=0;
                break;
                // 3 -- Affect 1 Alien
                case 3:
                takeActionOnOne();

                menu=0;
                break;

                // 4 -- Print List of All Aliens
                case 4:
                alienShelter.printAllAliens();
                menu=0;
                break;

                // 5 -- Adopt Out An Alien
                case 5:
                adoptAlien();

                menu=0;
                break;

                case 0:

                break;

                // 9 -- Print Menu Options
                case 9:
                printMenuOptions();
                menu=0;
                break;

                // 0 -- EXIT
                default:
                menu=0;
                break;
            }
        }
        }
    }


    private static int userInput(Scanner input) {
        return input.nextInt();
    }

    private static void printMenuOptions() {
        System.out.println("Press 1 to create a NEW Alien.");
        System.out.println("Press 2 to take action on ALL aliens.");
        System.out.println("Press 3 to take action just ONE Alien.");
        System.out.println("Press 4 Print a list of all aliens.");
        System.out.println("Press 5 adopt out Alien.");
        System.out.println("Press 0 to EXIT.");
    }

    public static void createAlien() {
        System.out.println("Please choose your Alien name");
        String alienName = input.nextLine();

        System.out.println("Please choose your Alien type and race");
        String inputType = testType();
        String inputRace = testRace();
        String inputTypeAndRace = inputType + " " + inputRace;
        constructAlien(inputTypeAndRace, alienName);
    }

       public static void constructAlien(String input, String alienName){
        //After picking name, type and race, this method actually makes the alien
        switch (input) {
            case "Cyborg Neptunian":
                VirtualAlien alien1 = new CyborgNeptunian(alienName);
                AddAndPrint(alien1);
                break;
            case  "Organic Neptunian":
                VirtualAlien alien2 = new OrganicNeptunian(alienName);
                AddAndPrint(alien2);
                break;
            case  "Cyborg Plutonian":
                VirtualAlien alien3 = new CyborgPlutonian(alienName);
                AddAndPrint(alien3);
                break;
            case  "Organic Plutonian":
                VirtualAlien alien4 = new OrganicPlutonian(alienName);
                AddAndPrint(alien4);
            }
    }

    private static void AddAndPrint(VirtualAlien alien) {
        //This method takes the created alien and puts it in the shelter
        alienShelter.addAlien(alien);
        System.out.println("Say hi to " + alien.getName() + ", a " + alien.getType() + " " + alien.getRace());
    }

    private static String testType() {
        //Picks Type Organic or Cyborg
        System.out.println(" Please choose an organic alien or a cyborg alien...");
        String answer = "";

        while (answer =="") {

            String alienType = input.nextLine();
            if (alienType.equalsIgnoreCase("organic")) {
                answer = "Organic";
            } else if (alienType.equalsIgnoreCase("cyborg")) {
                answer = "Cyborg";
            } else {
                System.out.println("Please choose a valid entry.");
                answer = "";
            }
        }
        return answer;
    }

    private static String testRace() {
        //Picks Race Plutonian or Neptunian
        System.out.println(" Please choose a Plutonian or Neptunian alien...");
        String answer = "";

        while (answer =="") {

            String alienType = input.nextLine();
            if (alienType.equalsIgnoreCase("Plutonian")) {
                answer = "Plutonian";
            } else if (alienType.equalsIgnoreCase("Neptunian")) {
                answer = "Neptunian";
            } else {
                System.out.println("Please choose a valid entry.");
                answer = "";
            }
        }
        return answer;
    }

     public static void adoptAlien() {
         System.out.println("Which alien do you want to adopt out?");
         ArrayList<VirtualAlien> shelter = alienShelter.retrieveAliens();

         //Gets total # of aliens and prints out the number and names
         int shelterSize = shelter.size();
         System.out.println("pick from " + shelterSize + " aliens.");
         for (VirtualAlien aliens : alienShelter.retrieveAliens()) {
             System.out.println(aliens.getName());
         }

         //Gets the choice of name and calls the adopt out method
         String choice = input.nextLine();
         alienShelter.adoptOutAlien(choice);
         System.out.println(choice + " is adopted out, say bye!");
     }

     public static void takeActionOnAll(){
         System.out.println("Press 1 to feed all aliens...");
         System.out.println("Press 2 to teach all aliens and make them smarter...");
         System.out.println("Press 3 to send all aliens to work...");

        int choice = input.nextInt();
        input.nextLine();
        //be able to choose what action to do to all the aliens
        switch(choice){
            case 1: //feed
                alienShelter.feedAllAliens();
                break;
            case 2: //increase intelligence, teach aliens
                alienShelter.teachAllAliens();
                break;
            case 3:  //send aliens to work
               alienShelter.payAllAliens();
                break;
        }
     }

    private static void takeActionOnOne() {
        //First Pick
        System.out.println("Which alien do you want to take action on?");

        //Gets the size and the names of the current aliens
        ArrayList<VirtualAlien> shelter = alienShelter.retrieveAliens();
        int shelterSize = shelter.size();
        System.out.println("pick from " + shelterSize + " aliens.");
        for (VirtualAlien aliens : alienShelter.retrieveAliens()) {
            System.out.println(aliens.getName());
        }

        //User inputs the name to take action on
        String alienName = input.nextLine();

        //What do you want to do?
        System.out.println("Press 1 to feed " + alienName + "...");
        System.out.println("Press 2 to teach " + alienName +  " and make it smarter...");
        System.out.println("Press 3 to send " + alienName +  " to work...");

        int choice = input.nextInt();
        //be able to choose what action to do to all the aliens
        switch(choice){
            case 1: //feed
                alienShelter.feedOne(alienName);
                break;
            case 2: //increase intelligence, teach aliens
                alienShelter.teachOne(alienName);
                break;
            case 3:  //send aliens to work
                alienShelter.acquireMoneyOne(alienName);
                break;
            }
        }

}
