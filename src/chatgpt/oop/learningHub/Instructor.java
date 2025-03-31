public class Instructor extends User{
    private int experienceYears;
    private String speciality;

    public Instructor(String firstName, String lastName, String email, int experienceYears, String speciality) throws IllegalAccessException {
        super(firstName, lastName, email);
        setExperienceYears(experienceYears);
        this.speciality = speciality;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if(experienceYears < 1 || experienceYears > 50){
            throw new IllegalArgumentException(String.format("Invalid experience for instructor %s %s - %d.", getFirstName(), getLastName(), getExperienceYears()));
        }
        this.experienceYears = experienceYears;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String getType() {
        return "Instructor";
    }

    @Override
    public String getInfo() {
        return String.format("%s %s, %d years experience years, Speciality: %s", getFirstName(), getLastName(), experienceYears, speciality);
    }
}
