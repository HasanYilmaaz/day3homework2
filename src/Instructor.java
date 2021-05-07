public class Instructor extends User{

    public Instructor(String firstName,String lastName,String achievements){
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.achievements = achievements;
}
    public Instructor(){

    }


    private String firstName;
    private String lastName;
    private String achievements;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }
}
