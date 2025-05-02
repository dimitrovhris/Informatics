public abstract class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) throws IllegalAccessException {
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

    public void setEmail(String email) throws IllegalAccessException {
        if(!email.contains(".") || !email.contains("@")){
            throw new IllegalAccessException(String.format("%s %s has invalid email!", firstName, lastName));
        }
        this.email = email;
    }
    public abstract String getType();
    public abstract String getInfo();
}
