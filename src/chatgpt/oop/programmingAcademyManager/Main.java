package chatgpt.oop.programmingAcademyManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new FileInputStream("academydata.txt"))) {
            ProgrammingAcademy programmingAcademy = new ProgrammingAcademy();
            String input = sc.nextLine();
            while (!input.equals("END")) {
                String[] lineEl = input.split(" ");
                switch (lineEl[0]) {
                    case "register":
                        try {
                            Student student = new Student(lineEl[1], lineEl[2], lineEl[3], lineEl[4], lineEl[5], lineEl[6]);
                            programmingAcademy.registerStudent(student);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "unregister":
                        programmingAcademy.unregisterStudent(lineEl[1]);
                        break;
                    case "info":
                        programmingAcademy.groupInfo(lineEl[1] + " " + lineEl[2]);
                        break;
                    default:
                        System.out.println(lineEl[0] + " - invalid command.");
                        break;

                }
                input = sc.nextLine();
            }
            System.out.println("Thank you for managing the Programming Academy!");
        }
    }
}
