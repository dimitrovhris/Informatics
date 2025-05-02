package chatgpt.oop.fitness;

public class Trainee extends CourseParticipant implements Schedulable{
    private String track;
    private int progress;

    public Trainee(String firstName, String lastName, String email, String track, int progress) {
        super(firstName, lastName, email);
        this.track = track;
        setProgress(progress);
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        if(progress < 0 || progress > 100){
            throw new IllegalArgumentException(String.format("Invalid progress for trainee %s %s: %d%%", getFirstName(), getLastName(), progress));
        }
        this.progress = progress;
    }

    @Override
    public String getRole() {
        return "Trainee";
    }

    @Override
    public String getSessionInfo() {
        return String.format("Track: %s, Progress: %d%%", track, progress);
    }
}
