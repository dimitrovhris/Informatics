package maturi.DZI0520243;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream("data.txt"));
        KinderGarden kinderGarden = new KinderGarden();
        String line = sc.nextLine();
        while (!line.equals("END")) {
            String command = line.split(" ")[0];
            if (command.equals("enrollment")) {
                String firstName = line.split(" ")[1];
                String lastName = line.split(" ")[2];
                String id = line.split(" ")[3];
                int age = Integer.parseInt(line.split(" ")[4]);
                String parentLastName = line.split(" ")[5];
                String parentGSM = line.split(" ")[6];
                try {
                    Kid kid = new Kid(firstName, lastName, id, age, parentLastName, parentGSM);
                    kinderGarden.enrollKid(kid);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (command.equals("unsubscribe")) {
                String id = line.split(" ")[1];
                try {
                    kinderGarden.releaseKid(id);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (command.equals("information")) {
                String group = line.split(" ")[1];
                try {
                    kinderGarden.groupInfo(group);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.printf("%s - invalid command.%n", command);
            }
            line = sc.nextLine();
        }
        System.out.println("Have a nice day!");
    }
}
