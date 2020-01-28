//package virtual_pet;
//
//import java.util.Scanner;
//
//public class AlienApplication {
//
//    public static void main(String[] args) {
//
//        System.out.println("Welcome to the Virtual Alien Game");
//        System.out.println("Press 1 to create a new Alien.");
//        Scanner input = new Scanner(System.in);
//        int create = input.nextInt();
//        if (create == 1) {
//            createAlien();
//        }
//    }
//
//    public static void createAlien() {
//        //set name
//        System.out.println("Please choose your Alien name");
//        Scanner input = new Scanner(System.in);
//        String alienName = input.nextLine();
//
//        //choose type
//        String alienType = testType();
//        VirtualAlien alien = new VirtualAlien(alienName);
//        System.out.println("You have chosen the name: " + alien.getName() + " and the type: " + alien.getType());
//    }
//
//    private static String testType() {
//        System.out.println(" Please choose an organic alien or a cyborg alien.");
//        String answer = "";
//
//        while (answer.equals("")) {
//            Scanner inputType = new Scanner(System.in);
//            String alienType = inputType.nextLine();
//            if (alienType.equalsIgnoreCase("organic")) {
//                answer = "organic";
//            } else if (alienType.equalsIgnoreCase("cyborg")) {
//                answer = "cyborg";
//            } else {
//                System.out.println("Please choose a valid entry.");
//                answer = "";
//            }
//        }
//        return answer;
//    }
//
//}
