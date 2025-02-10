package maturi.DZI082024.zad28;

public class Director extends ClubMember{
    private String directorType;

    public Director(String firstName, String lastName, int age, double salary, String directorType) {
        super(firstName, lastName, age, salary);
        this.directorType = directorType;
    }

    @Override
    public void info() {
        System.out.printf(
                "%s director: %s %s%n" +
                "salary: %.2f lv%n" +
                "age: %d years%n",
                directorType, getFirstName(), getLastName(), getSalary(), getAge());
    }

    public String getDirectorType() {
        return directorType;
    }

    public void setDirectorType(String directorType) {
        this.directorType = directorType;
    }
}
