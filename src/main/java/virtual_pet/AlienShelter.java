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
            System.out.println(alienToBeFed.getName() + ": 'You fed me, yummy yummy'");
        }
    }

    public void payAllAliens() {
        System.out.println("Paying all aliens . . .");
        for (VirtualAlien alienToBePaid : alienList.values()){
            alienToBePaid.acquireMoney();
            if(alienToBePaid instanceof Neptunian){
                ((Neptunian) alienToBePaid).sweetPay(7);
            } else {
                System.out.println(alienToBePaid.getName() + ": I got paid " + alienToBePaid.payAmount +" as a " +
                        alienToBePaid.getType() + " " + alienToBePaid.getRace() + "!" );
            }
            System.out.println(alienToBePaid.getName() + "'s new finances are: " + alienToBePaid.getFinances());
        }
    }

    public void teachAllAliens() {
        System.out.println("Teaching all aliens . . .");
        for (VirtualAlien alienToBeRead : alienList.values()){
            alienToBeRead.read();
            System.out.println(alienToBeRead.getName() + "'s new intelligence are: " + alienToBeRead.getIntelligence());
        }
    }

    public void printAllAliens(){
        System.out.println("| - NAME - | - TYPE - | - RACE - | - Hunger - | - Finances - | - Intelligence - |");
        System.out.println("   ---------------------------------------------");
        for (VirtualAlien alien : alienList.values()){
            System.out.println("| - " + alien.getName() +
                    " - | - " + alien.getType() +
                    " - | - " + alien.getRace() +
                    " - | - " + alien.getHunger() +
                    "   - | -   " + alien.getFinances() +
                    "   - | -   " + alien.getIntelligence() +

                    " - |");
        }
    }
    public int numAliensInShelter(){
        int i = 0;
        for(String alienName : alienList.keySet()){
            i++;
        } return i;
    }


}
