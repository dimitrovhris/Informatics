package chatgpt.oop.fitness;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try(Scanner sc = new Scanner(new FileInputStream("input.txt"))){
            List<CourseParticipant> courseParticipants = new ArrayList<>();
            while(sc.hasNext()){
                String[] inputEl = sc.nextLine().split(" ");
                switch (inputEl[0]){
                    case "Instructor":
                        try{
                            courseParticipants.add(new Instructor(inputEl[1], inputEl[2], inputEl[3], inputEl[4], Double.parseDouble(inputEl[5])));
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Trainee":
                        try{
                            courseParticipants.add(new Trainee(inputEl[1], inputEl[2], inputEl[3], inputEl[4], Integer.parseInt(inputEl[5])));
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    case "PrintAll":
                        for(CourseParticipant participant: courseParticipants){
                            if(participant instanceof Schedulable schedulable){
                                System.out.println(participant.getRole() + ": " + participant.toString() + " | " + schedulable.getSessionInfo());
                            }
                        }
                        break;
                    case "PrintInstructors":
                        for(CourseParticipant participant: courseParticipants){
                            if (participant instanceof Instructor instructor){
                                System.out.println(instructor.getRole() + ": " + instructor.toString() + " | " + instructor.getSessionInfo());
                            }
                        }
                        break;
                    case "PrintTrainees":
                        for(CourseParticipant participant: courseParticipants){
                            if(participant instanceof  Trainee trainee){
                                System.out.println(trainee.getRole() + ": " + trainee.toString() + " | " + trainee.getSessionInfo());
                            }
                        }
                        break;
                    default:
                        System.out.println("Program terminated.");
                        break;
                }
            }
        }
    }
}
