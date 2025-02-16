package chatgpt.oop.sportsClubManager;

public class Camper extends Person{
    private int age;
    private String category;
    private String guardianName;
    private String guardianContact;


    public Camper(String firstName, String lastName, String regNumber, int age, String guardianName, String guardianContact) throws Exception {
        super(firstName, lastName, regNumber);
        setAge(age);
        setCategory(age);
        this.guardianName = guardianName;
        this.guardianContact = guardianContact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 8 || age > 15){
            throw new Exception(String.format("The camper %s %s age is invalid - %d", getFirstName(), getLastName(), age));
        }
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(int age) {
        if(age <= 10){
            this.category = "Junior";
        } else if(age <= 13){
            this.category = "Intermediate";
        } else{
            this.category = "Senior";
        }
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %d, %s(%s)", getFirstName(), getLastName(), age, guardianContact, guardianName);
    }
}
