import java.util.*;

public class LearningPlatform {
    List<Student> students;
    List<Instructor> instructors;

    public LearningPlatform() {
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }

    public void registerStudent(Student student){
        students.add(student);
        System.out.printf("Student %s %s registered.%n", student.getFirstName(), student.getLastName());
    }
    public void registerInstructor(Instructor instructor){
        instructors.add(instructor);
        System.out.printf("Instructor %s %s registered.%n", instructor.getFirstName(), instructor.getLastName());
    }

    public void removeUserByEmail(String email){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getEmail().equals(email)){
                System.out.printf("Student %s %s removed.%n", students.get(i).getFirstName(), students.get(i).getLastName());
                students.remove(i);
                return;
            }
        }
        for(int i = 0; i < instructors.size(); i++){
            if(instructors.get(i).getEmail().equals(email)){
                System.out.printf("Student %s %s removed.%n", instructors.get(i).getFirstName(), instructors.get(i).getLastName());
                instructors.remove(i);
                return;
            }
        }
        System.out.printf("No user found with email %s.%n", email);;
    }

    public void trackInfo(String track){
        List<Student> trackStudents = new ArrayList<>();
        for(Student student: students){
            if(student.getTrack().equals(track)){
                trackStudents.add(student);
            }
        }
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getProgress(), o2.getProgress());
            }
        };
        trackStudents.sort(comparator);
        System.out.printf("Track: %s - %d students%n", track, trackStudents.size());
        for(Student student: students){
            System.out.println(student.getInfo());
        }
    }

    public void topProgressStudents(int limit){
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getProgress(), o1.getProgress());
            }
        };
        students.sort(comparator);
        for(int i = 0; i < limit; i++){
            System.out.println(students.get(i).getInfo());
        }
    }

    public void instructorStats(){
        Map<String, Integer> instructors = new HashMap<>();
        for(Student student: students){
            if(!instructors.containsKey(student.getInstructorName())){
                instructors.put(student.getInstructorName(), 0);
            } else{
                instructors.put(student.getInstructorName(), instructors.get(student.getInstructorName() + 1));
            }
        }
        for (Map.Entry<String, Integer> entry : instructors.entrySet()) {
            System.out.printf("%s - %d students", entry.getKey(), entry.getValue());
        }
    }
}
