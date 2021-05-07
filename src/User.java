public class User {
    public User (){

    }
    public User(int usernameId,String username,String email, String password ,String info ,String myCourses){
        super();
        this.usernameId = usernameId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.info = info;
        this.myCourses = myCourses;

    }
    private int usernameId;
    private String username;
    private String email;
    private String password;
    private String info;
    private String myCourses;


    public int getUsernameId() {
        return usernameId;
    }

    public void setUsernameId(int usernameId) {
        this.usernameId = usernameId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String myCourses) {
        this.myCourses = myCourses;
    }
}
