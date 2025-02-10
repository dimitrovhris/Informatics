package maturi.DZI082024.zad28;

public abstract class ClubMember {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public ClubMember(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public abstract void info();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.isEmpty()){
            throw new IllegalArgumentException("The name can't be an empty string!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("The name can't be an empty string!");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 17){
            throw new IllegalArgumentException("Age must be greater than 17 years!");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            throw new IllegalArgumentException("Salary must be a positive number!");
        }
        this.salary = salary;
    }
}
