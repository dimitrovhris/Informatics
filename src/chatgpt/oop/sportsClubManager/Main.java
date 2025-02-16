package chatgpt.oop.sportsClubManager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("campdata.txt"))) {
            SummerCamp summerCamp = new SummerCamp();
            String input = sc.nextLine();
            while (!input.equals("END")) {
                String[] inputElements = input.split("\\s+");
                String command = inputElements[0];
                switch (command) {
                    case "register":
                        try {
                            Camper camper = new Camper(inputElements[1], inputElements[2], inputElements[3], Integer.parseInt(inputElements[4]), inputElements[5], inputElements[6]);
                            summerCamp.registerCamper(camper);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "deregister":
                        String camperRegNumber = inputElements[1];
                        summerCamp.deregisterCamper(camperRegNumber);
                        break;
                    case "info":
                        String category = inputElements[1];
                        summerCamp.categoryInfo(category);
                        break;
                    default:
                        System.out.printf("%s - invalid command.%n", command); //Въпрос към chatgpt: тук command или input да сложа като параметър?
                        break;
                }
                input = sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you for using Summer Camp Manager!");
    }
}
