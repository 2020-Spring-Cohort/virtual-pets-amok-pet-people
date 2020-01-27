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

    public ArrayList<VirtualAlien> retrieveAliens() {
        return new ArrayList<>(alienList.values());
    }

    public void feedAllAliens() {
        for (VirtualAlien alienToBeFed : alienList.values()){
            alienToBeFed.feed();
            System.out.println(alienToBeFed.getName() + ": 'You fed me, yummy yummy'");
        }
    }
    public void printAllAliens(){
        System.out.println("| - NAME - | - TYPE - | - HUNGER - |");
        System.out.println("   ------------------------------");
        for (VirtualAlien alien : alienList.values()){
            System.out.println("| - " + alien.getName() +
                    " - | - " + alien.getType() +
                    " - | - " + alien.getHunger() +
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
