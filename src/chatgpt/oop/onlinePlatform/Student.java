package onlinePlatform;

public class Student extends Participant{
    public Student(String firstName, String lastname, String id, int completedModules, int totalModules, String coachName) {
        super(firstName, lastname, id, completedModules, totalModules, coachName);
        if(totalModules < 5){
            throw new IllegalArgumentException("Student programs must have at least 5 modules");
        }
    }

    @Override
    public String getType() {
        return "";
    }
}
