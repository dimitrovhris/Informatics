package chatgpt.oop.programmingAcademyManager;

public class Student extends Person{
    private String level;
    private String group;
    private String instructor;
    private String instructorPhone;

    public Student(String firstName, String lastName, String email, String level, String instructor, String instructorPhone) {
        super(firstName, lastName, email);
        setLevel(level);
        setGroup();
        this.instructor = instructor;
        this.instructorPhone = instructorPhone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        if(!level.equals("Beginner") && !level.equals("Intermediate") && !level.equals("Advanced")){
            throw new IllegalArgumentException(String.format("Invalid level %s for %s %s!", level, getFirstName(), getLastName()));
        }
        this.level = level;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup() {
        switch (level){
            case "Beginner":
                this.group = "Group A";
                break;
            case "Intermediate":
                this.group = "Group B";
                break;
            case "Advanced":
                this.group = "Group C";
                break;
        }
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructorPhone() {
        return instructorPhone;
    }

    public void setInstructorPhone(String instructorPhone) {
        this.instructorPhone = instructorPhone;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %s, %s (%s)", getFirstName(), getLastName(), level, instructorPhone, instructor);
    }
}
