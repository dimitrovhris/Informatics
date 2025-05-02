import java.util.Comparator;

public class Student extends User{
    private int age;
    private String track;
    private int progress;
    private String instructorName;

    public Student(String firstName, String lastName, String email, int age, String track, int progress, String instructorName) throws IllegalAccessException {
        super(firstName, lastName, email);
        setAge(age);
        this.track = track;
        setProgress(progress);
        this.instructorName = instructorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAccessException {
        if(age < 15 || age > 65){
            throw new IllegalAccessException(String.format("Invalid age for %s %s - %d.", getFirstName(), getLastName(), age));
        }
        this.age = age;
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

    public void setProgress(int progress) throws IllegalAccessException {
        if(progress < 0 || progress > 100){
            throw new IllegalAccessException(String.format("Invalid progress for %s %s - %s%%", getFirstName(), getLastName(), progress));
        }
        this.progress = progress;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public String getType() {
        return "Student";
    }

    @Override
    public String getInfo() {
        return String.format("%s %s, %d y.o., %s, %d%%, Instructor: %s", getFirstName(),getLastName(), age, track, progress, instructorName);
    }

    public static Comparator<Student> getComparatorByTrackThenProgress(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int compareNumber = s1.getTrack().compareTo(s2.getTrack());
                if(compareNumber == 0){
                    compareNumber= Integer.compare(s2.getProgress(), s1.getProgress());
                }
                if(compareNumber == 0){
                    compareNumber = s1.getLastName().compareTo(s2.getLastName());
                }
                return compareNumber;
            }
        };
    }
}
