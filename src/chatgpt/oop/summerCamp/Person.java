package chatgpt.oop.summerCamp;

public class Person {
    private String firstName;
    private String lastName;
    private String regNumber;

    public Person(String firstName, String lastName, String regNumber) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        setRegNumber(regNumber);
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

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) throws Exception {
        if(regNumber.length() != 9){
            throw new Exception(String.format("%s %s - invalid registration number!", firstName, lastName));
        }
        this.regNumber = regNumber;
    }
}
