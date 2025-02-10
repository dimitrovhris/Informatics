package maturi.DZI082024.zad28;

public class FootballPlayer extends ClubMember{
    private String position;
    private int contractLength;
    private int matches;
    private int goals;
    private int assist;

    public FootballPlayer(String firstName, String lastName, int age, double salary, String position, int contractLength, int matches, int goals, int assist) {
        super(firstName, lastName, age, salary);
        this.position = position;
        this.contractLength = contractLength;
        this.matches = matches;
        this.goals = goals;
        this.assist = assist;
    }

    public FootballPlayer(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age, salary);
    }

    @Override
    public void info() {
        System.out.printf(
                "%s %s - %s%n" +
                        "salary: %.2f lv" +
                        "age: %d years%n" +
                        "%d goals and %d assists in %d matches%n",
                getFirstName(), getLastName(), position, getSalary(), getAge(), goals, assist, matches);
    }
}
