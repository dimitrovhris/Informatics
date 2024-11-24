package maturi.DZI0520243;

import java.util.*;

public class KinderGarden {
    private List<Kid> kidList;

    public KinderGarden() {
        this.kidList = new ArrayList<>();
    }

    public void enrollKid(Kid kid){
        kidList.add(kid);
        System.out.printf("The child %s %s is enrolled.%n", kid.getFirstName(), kid.getLastName());
    }
    public void releaseKid(String id){
        for(Kid kid: kidList){
            if(kid.getId().equals(id)){
                System.out.printf("The child %s %s has been unsubscribed.%n", kid.getFirstName(), kid.getLastName());
                kidList.remove(kid);
                return;
            }
        }
        System.out.printf("Unsubscribe failed - invalid identifier %s.%n", id);
    }
    public void groupInfo(String group){
        List<Kid> currentGroup = new ArrayList<>();
        for(Kid kid: kidList){
            if(kid.getGroup().equals(group)){
                currentGroup.add(kid);
            }
        }
        Collections.sort(currentGroup, compareByName);
        System.out.printf("%s group - %d children.%n", group, currentGroup.size());
        for(Kid kid: currentGroup){
            System.out.println(kid.toString());}
    }

        Comparator<Kid> compareByName = new Comparator<Kid>() {
            @Override
            public int compare(Kid kid1, Kid kid2) {
                int comp1 = kid1.getFirstName().compareTo(kid2.getFirstName());
                int comp2 = kid1.getLastName().compareTo(kid2.getLastName());
                if(comp1 == 0){
                    return comp2;
                }
                return comp1;
            }
        };
    }

