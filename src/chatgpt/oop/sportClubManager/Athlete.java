package chatgpt.oop.sportClubManager;

public class Athlete extends Person{
    private int age;
    private String category;
    private String coachName;
    private String coachContact;

    public Athlete(String firstName, String lastName, String id, int age, String coachName, String coachContact) {
        super(firstName, lastName, id);
        setAge(age);
        setCategory();
        this.coachName = coachName;
        this.coachContact = coachContact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 10 || age > 18){
            throw new IllegalArgumentException(String.format("The athlete %s %s age is invalid - %d", getFirstName(), getLastName(), age));
        }
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if(age <= 12){
            this.category = "Youth";
        } else if(age <= 15){
            this.category = "Junior";
        } else{
            this.category = "Senior";
        }
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachContact() {
        return coachContact;
    }

    public void setCoachContact(String coachContact) {
        this.coachContact = coachContact;
    }
    @Override
    public String toString(){
        return String.format("%s %s, %d, %s (%s)", getFirstName(), getLastName(), age, coachContact, coachName);
    }
}
