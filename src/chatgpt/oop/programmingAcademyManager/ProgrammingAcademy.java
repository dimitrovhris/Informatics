package chatgpt.oop.programmingAcademyManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgrammingAcademy {
    private List<Student> students;

    public ProgrammingAcademy() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(Student student){
        students.add(student);
        System.out.printf("Student %s %s registered.%n", student.getFirstName(), student.getLastName());
    }
    public void unregisterStudent(String email){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getEmail().equals(email)){
                System.out.printf("Student %s %s unregistered.%n", students.get(i).getFirstName(), students.get(i).getLastName());
                students.remove(i);
                return;
            }
        }
        System.out.printf("Unregistered failed - no student with email %s%n", email);
    }
    public void groupInfo(String group){
        List<Student> sortedStudents = new ArrayList<>();
        for(Student student: students){
            if(student.getGroup().equals(group)){
                sortedStudents.add(student);
            }
        }
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getLastName().compareTo(s2.getLastName()) == 0){
                    return s1.getFirstName().compareTo(s2.getFirstName());
                } else{
                    return s1.getLastName().compareTo(s2.getLastName());
                }
            }
        };
        sortedStudents.sort(comparator);
        System.out.printf("%s - %d students%n", group, sortedStudents.size());
        sortedStudents.forEach(System.out::println);
    }
}
