package onlinePlatform;

public abstract class Participant {
    private String firstName;
    private String lastname;
    private String id;
    private int completedModules;
    private int totalModules;
    private String coachName;

    public Participant(String firstName, String lastname, String id, int completedModules, int totalModules, String coachName) {
        this.firstName = firstName;
        this.lastname = lastname;
        setId(id);
        this.completedModules = completedModules;
        this.totalModules = totalModules;
        this.coachName = coachName;
    }

    public abstract String getType();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() != 9){
            throw new IllegalArgumentException(String.format("%s %s - invalid identifier", getFirstName(), getLastname()));
        }
        this.id = id;
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public void setCompletedModules(int completedModules) {
        if(totalModules <= 0){
            throw new IllegalArgumentException(String.format("Invalid module data for %s %s", getFirstName(), getLastname()));
        }
        this.completedModules = completedModules;
    }

    public int getTotalModules() {
        return totalModules;
    }

    public void setTotalModules(int totalModules) {
        this.totalModules = totalModules;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        if(coachName.contains(" ")){
            throw new IllegalArgumentException(String.format("Coach name must be one word: %s", coachName));
        }
        this.coachName = coachName;
    }
}
