package chatgpt.oop.musicAcademy;

public class Person {
    private String firstName;
    private String lastName;
    private String id;

    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setId(String id) {
        if(id.length() != 9){
            throw new IllegalArgumentException(String.format("%s %s - invalid identifier!" , firstName, lastName));
        }
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("%s %s (ID: %s)", firstName, lastName, id);
    }
}
