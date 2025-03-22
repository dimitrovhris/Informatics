package musicAcademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MusicAcademy musicAcademy = new MusicAcademy();
        try (Scanner sc = new Scanner(new FileInputStream("academydata.txt"))) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                if (line.equals("END")) {
                    break;
                }
                String[] lineEl = line.split(" ");
                String command = lineEl[0];
                switch (command) {
                    case "register":
                        Student student = new Student(lineEl[1], lineEl[2], lineEl[3], Integer.parseInt(lineEl[4]), lineEl[5], lineEl[6], lineEl[7]);
                        musicAcademy.registerStudent(student);
                        break;
                    case "unregister":
                        try{
                            musicAcademy.unregisterStudent(lineEl[1]);
                        } catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "info":
                        musicAcademy.categoryInfo(lineEl[1]);
                        break;
                    default:
                        System.out.println(line + " - invalid command.");
                        break;
                }
            }
        }
        System.out.println("Thank you for using Music Academy!");
    }
}
