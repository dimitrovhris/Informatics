package chatgpt.oop.summerCamp;

import java.util.ArrayList;
import java.util.List;

public class SummerCamp {
    private List<Camper> camperList;

    public SummerCamp() {
        this.camperList = new ArrayList<>();
    }

    public void registerCamper(Camper camper){
        camperList.add(camper);
        System.out.printf("The camper %s %s is registered.%n", camper.getFirstName(), camper.getLastName());
    }

    public void deregisterCamper(String regNumber){
        for(Camper camper: camperList){
            if(camper.getRegNumber().equals(regNumber)){
                camperList.remove(camper);
                System.out.printf("The camper %s %s is deregistered.%n", camper.getFirstName(), camper.getLastName());
                break;
            }
            System.out.printf("Deregistration failed - invalid registration number %s%n", regNumber);
        }
    }
    public void categoryInfo(String category){
        List<Camper> categoryCampers = new ArrayList<>();
        for(Camper camper: camperList){
            if(camper.getCategory().equals(category)){
                categoryCampers.add(camper);
            }
        }
        System.out.printf("%s category - %d campers.%n", category, categoryCampers.size());
        for (Camper camper: categoryCampers){
            System.out.println(camper);
        }
    }

}
