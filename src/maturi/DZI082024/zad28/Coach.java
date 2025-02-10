package maturi.DZI082024.zad28;

public class Coach extends ClubMember{
    private String coachType;
    private int contractLength;

    public Coach(String firstName, String lastName, int age, double salary, String coachType, int contractLength) {
        super(firstName, lastName, age, salary);
        this.coachType = coachType;
        this.contractLength = contractLength;
    }

    public Coach(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age, salary);
    }

    @Override
    public void info() {
        System.out.printf(
                "%s coach: %s %s%n" +
                        "salary: %.2f lv%n" +
                        "age: %d years%n",
                coachType, getFirstName(), getLastName(), getSalary(), getAge());
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }
}
