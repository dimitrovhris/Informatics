package chatgpt.oop.sportClubManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SportClub {
    private List<Athlete> athleteList;

    public SportClub() {
        this.athleteList = new ArrayList<>();
    }

    public void registerAthlete(Athlete athlete) {
        athleteList.add(athlete);
        System.out.printf("The athlete %s %s is registered.%n", athlete.getFirstName(), athlete.getLastName());
    }

    public void unregisterAthlete(String id) {
        for(int i = 0; i < athleteList.size(); i++){
            if(athleteList.get(i).getId().equals(id)){
                System.out.printf("The athlete %s %s is unregistered.%n", athleteList.get(i).getFirstName(), athleteList.get(i).getLastName());
                athleteList.remove(i);
                return;
            }
        }
        System.out.printf("Unregistered failed - invalid identifier %s.%n", id);
    }

    public void categoryInfo(String category) {
        int count = 0;
        for (Athlete athlete : athleteList) {
            if (athlete.getCategory().equals(category))
                count++;
        }
        System.out.printf("%s category - %d athletes.%n", category, count);


        Comparator<Athlete> comparator = new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                int compareValue = o1.getLastName().compareTo(o2.getLastName());
                if (compareValue == 0) {
                    compareValue = o1.getFirstName().compareTo(o2.getFirstName());
                }
                return compareValue;
            }
        };
        athleteList.sort(comparator);

        for (Athlete athlete : athleteList) {
            if (athlete.getCategory().equals(category)) {
                System.out.println(athlete);
            }
        }
    }
}
