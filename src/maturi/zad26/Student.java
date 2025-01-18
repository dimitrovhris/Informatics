package maturi.zad26;

public class Student extends Human{
    private final double grade;

    public Student(String firstName, String lastName, int age, double grade) {
        super(firstName, lastName, age);
        this.grade = grade;
    }

    @Override
    public String toString(){
        return String.format("%s %s, %d years old, grade: %.2f", getFirstName(), getLastName(), getAge(), grade);
    }
}
