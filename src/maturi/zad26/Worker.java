package maturi.zad26;

public class Worker extends Human{
    private final double wage;
    private final int workHours;

    public Worker(String firstName, String lastName, int age, double wage, int workHours) {
        super(firstName, lastName, age);
        this.wage = wage;
        this.workHours = workHours;
    }

    public double salary(){
        return wage * workHours;
    }
    @Override
    public String toString(){
        return String.format("%s %s, %d years old, salary: $%.2f", getFirstName(), getLastName(), getAge(), salary());
    }
}
