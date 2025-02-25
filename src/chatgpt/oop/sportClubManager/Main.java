package chatgpt.oop.sportClubManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SportClub sportClub = new SportClub();
        try (Scanner sc = new Scanner(new FileInputStream("src/chatgpt/oop/sportClubManager/input.txt"))) {
            String input = sc.nextLine();
            while (!input.equals("END")) {
                String[] lineEl = input.split("\\s+");
                String command = lineEl[0];
                switch (command) {
                    case "register":
                        try {
                            Athlete athlete = new Athlete(lineEl[1], lineEl[2], lineEl[3], Integer.parseInt(lineEl[4]), lineEl[5], lineEl[6]);
                            sportClub.registerAthlete(athlete);
                        }catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "unregister":
                        String id = lineEl[1];
                        sportClub.unregisterAthlete(id);
                        break;
                    case "info":
                        String category = lineEl[1];
                        sportClub.categoryInfo(category);
                        break;
                    default:
                        System.out.printf("%s - invalid command.%n", command);
                        break;
                }
                input = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you for participating in the Sport Club!");
    }
}
