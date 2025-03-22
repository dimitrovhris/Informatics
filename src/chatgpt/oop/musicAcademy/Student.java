package musicAcademy;

public class Student extends Person{
    private int age;
    private String category;
    private String instrument;
    private String instructorName;
    private String instructorContact;

    public Student(String firstName, String lastName, String id, int age, String instrument, String instructorName, String instructorContact) {
        super(firstName, lastName, id);
        setAge(age);
        setCategory();
        this.instrument = instrument;
        this.instructorName = instructorName;
        this.instructorContact = instructorContact;
    }

    public Student(String firstName, String lastName, String id) {
        super(firstName, lastName, id);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 10 || age > 18){
            throw new IllegalArgumentException(String.format("The student %s %s age is invalid - %d", getFirstName(), getLastName(), age));
        }
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if(age <= 12){
            this.category = "Beginner";
        } else if(age <= 15){
            this.category = "Intermediate";
        } else{
            this.category = "Advanced";
        }
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorContact() {
        return instructorContact;
    }

    public void setInstructorContact(String instructorContact) {
        this.instructorContact = instructorContact;
    }
    @Override
    public String toString(){
        return String.format("%s %s, %d, %s, %s (%s)", getFirstName(), getLastName(), age, instrument, instructorContact, instructorName);
    }
}
