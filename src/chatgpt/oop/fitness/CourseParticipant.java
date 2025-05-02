package chatgpt.oop.fitness;

public abstract class CourseParticipant {
    private String firstName;
    private String lastName;
    private String email;

    public CourseParticipant(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")){
            throw new IllegalArgumentException(String.format("Invalid email for %s %s", firstName, lastName));
        }
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("%s %s (%s)", firstName, lastName, email);
    }

    public abstract String getRole();


}
