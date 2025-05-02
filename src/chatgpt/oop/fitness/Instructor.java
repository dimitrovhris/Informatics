package chatgpt.oop.fitness;

public class Instructor extends CourseParticipant implements Schedulable{
    private String topic;
    private double hourlyRate;

    public Instructor(String firstName, String lastName, String email, String topic, double hourlyRate) {
        super(firstName, lastName, email);
        this.topic = topic;
        this.hourlyRate = hourlyRate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate <= 0){
            throw new IllegalArgumentException(String.format("Invalid rate for instructor %s %s: %.2f", getFirstName(), getLastName(), hourlyRate));
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getRole() {
        return "Instructor";
    }

    @Override
    public String getSessionInfo() {
        return String.format("Session: %s with %s %s", topic, getFirstName(), getLastName());
    }
}
