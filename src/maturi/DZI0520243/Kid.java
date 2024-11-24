package maturi.DZI0520243;

public class Kid extends Person{
    private int age;
    private String group;
    private String parentLastName;
    private String parentGSM;

    public Kid(String firstName, String lastName, String id, int age, String parentLastName, String parentGSM) throws Exception {
        super(firstName, lastName, id);
        setAge(age);
        setGroup();
        setParentLastName(parentLastName);
        setParentGSM(parentGSM);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 3 || age > 6){
            throw new Exception(String.format("The child %s %s age is invalid - %d", getFirstName(), getLastName(), age));
        }
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup() {
        switch(getAge()){
            case 3:
                group = "I";
                break;
            case 4:
                group = "II";
                break;
            case 5:
                group = "III";
                break;
            case 6:
                group = "IV";
                break;
        };
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentGSM() {
        return parentGSM;
    }

    public void setParentGSM(String parentGSM) {
        this.parentGSM = parentGSM;
    }
    @Override
    public String toString(){
        return String.format("%s %s, %d, %s (%s)", getFirstName(), getLastName(), getAge(), getParentGSM(), getParentLastName());
    }
}
