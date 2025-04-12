package chatgpt.oop.musicAcademy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusicAcademy {
    private List<Student> studentList;

    public MusicAcademy() {
        this.studentList = new ArrayList<>();
    }

    public void registerStudent(Student student) {
        studentList.add(student);
        System.out.printf("The student %s %s is registered.%n", student.getFirstName(), student.getLastName());
    }

    public void unregisterStudent(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                System.out.printf("The student %s %s is unregistered.%n", studentList.get(i).getFirstName(), studentList.get(i).getLastName());
                studentList.remove(i);
                return;
            }
        }
        System.out.printf("Unregistered failed - invalid identifier %s.%n", id);
    }
    Comparator< Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int compareResult  = s1.getLastName().compareTo(s2.getLastName());
            if(compareResult == 0){
                compareResult = s1.getFirstName().compareTo(s2.getFirstName());
            }
            return compareResult;
        }
    };

    public void categoryInfo(String category) {
        List<Student> currentList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCategory().equals(category)) {
                currentList.add(studentList.get(i));
            }
        }
        currentList.sort(comparator);
        System.out.printf("%s category - %d students.%n", category, currentList.size());
        for(Student student: currentList){
            System.out.println(student);
        }
    }
}
