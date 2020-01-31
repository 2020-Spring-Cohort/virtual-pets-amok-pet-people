package virtual_pet;
import java.util.ArrayList;
import java.util.HashMap;

public class AlienShelter {

    private HashMap<String, VirtualAlien> alienList = new HashMap<>();

    public HashMap<String, VirtualAlien> getAlienList() {
        return alienList;
    }

    public void addAlien(VirtualAlien alien) {
        alienList.put(alien.getName(), alien);
    }

    public void adoptOutAlien(String choice) {
        alienList.remove(choice);
    }

    public ArrayList<VirtualAlien> retrieveAliens() {
        return new ArrayList<>(alienList.values());
    }

    public void feedAllAliens() {
        for (VirtualAlien alienToBeFed : alienList.values()){
            alienToBeFed.feed();
            if (alienToBeFed instanceof Plutonian){
                ((Plutonian) alienToBeFed).sweetFeed(6);
            }
        }
    }

    public void payAllAliens() {
        System.out.println("Paying all aliens . . .");
        for (VirtualAlien alienToBePaid : alienList.values()){
            alienToBePaid.acquireMoney();
            if(alienToBePaid instanceof Neptunian){
                ((Neptunian) alienToBePaid).sweetPay(7);
                int extraCash = 7;
                System.out.println(alienToBePaid.getName() + " got paid: $" + alienToBePaid.payAmount +
                        ", and an extra $" + extraCash + " as a " + alienToBePaid.getType() + " " + alienToBePaid.getRace());

            } else {
                System.out.println(alienToBePaid.getName() + " got paid $" + alienToBePaid.payAmount +" as a " +
                        alienToBePaid.getType() + " " + alienToBePaid.getRace() + "!" );
            }
            System.out.println(alienToBePaid.getName() + "'s new finances are: $" + alienToBePaid.getFinances());
            System.out.println(" ");
        }
    }

    public void teachAllAliens() {
        System.out.println("Teaching all aliens . . .");
        for (VirtualAlien alienToBeRead : alienList.values()){
            alienToBeRead.read();
            System.out.println(alienToBeRead.getName() + "'s new intelligence is: " + alienToBeRead.getIntelligence()) ;
            System.out.println(" ");
        }
    }

    public void printAllAliens(){
//        System.out.println("| - NAME - | - TYPE - | - RACE - | - Hunger - | - Finances - | - Intelligence - |");
//        System.out.println(" -------------------------------------------------------------------------------");
//        for (VirtualAlien alien : alienList.values()){
//            System.out.printf("| - " + alien.getName() +
//                    " - | - " + alien.getType() +
//                    " - | - " + alien.getRace() +
//                    " - | - " + alien.getHunger() +
//                    " - | -   " + alien.getFinances() +
//                    "   - | -   " + alien.getIntelligence() +
//
//                    " - |");
//            System.out.println("\n");
            String leftAlignFormat = "| %-7s | %-9s | %-9s | %6d | %8d | %12d |%n";

            System.out.format("+---------+-----------+-----------+--------+----------+--------------+%n");
            System.out.format("|  NAME   | TYPE      | RACE      | Hunger | Finances | Intelligence |%n");
            System.out.format("+---------+-----------+-----------+--------+----------+--------------+%n");
            for (VirtualAlien alien : alienList.values()){
                System.out.format(leftAlignFormat, alien.getName()
                                , alien.getType()
                                , alien.getRace()
                                , alien.getHunger()
                                , alien.getFinances()
                                , alien.getIntelligence());
            }
        System.out.format("+---------+-----------+-----------+--------+----------+--------------+%n");
        }

    public int numAliensInShelter(){
        int i = 0;
        for(String alienName : alienList.keySet()){
            i++;
        } return i;
    }


    public void feedOne(String choice) {
        VirtualAlien alienToBeFed = alienList.get(choice);
        alienToBeFed.feed();
        System.out.println("You Fed " + alienToBeFed.getName() );
        System.out.println(" ");
    }
    public void teachOne(String choice) {
        VirtualAlien alienToBeTaught = alienList.get(choice);
        alienToBeTaught.read();
        System.out.println("You made " + alienToBeTaught.getName() + " smarter.");
        System.out.println(" ");
    }
    public void acquireMoneyOne(String choice) {
        VirtualAlien alienToBePaid = alienList.get(choice);
        alienToBePaid.acquireMoney();
        if(alienToBePaid instanceof Neptunian){
            ((Neptunian) alienToBePaid).sweetPay(7);
        }
        System.out.println("You made " + alienToBePaid.getName() + " richer. New finances are: $" + alienToBePaid.getFinances());
        System.out.println(" ");
    }

    public void tickAll() {
        for (VirtualAlien alienToBeTicked : alienList.values()) {
            alienToBeTicked.tick();
        }
    }
}
