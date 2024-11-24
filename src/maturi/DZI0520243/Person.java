package maturi.DZI0520243;

public class Person {
    private String firstName;
    private String lastName;
    private String id;

    public Person(String firstName, String lastName, String id) throws Exception {
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
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

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if(id.length() != 10){
            throw new Exception(String.format("%s %s - invalid identifier!", getFirstName(), getLastName()));
        }
        this.id = id;
    }
}
