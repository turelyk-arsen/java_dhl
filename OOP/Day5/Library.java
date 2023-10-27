package OOP.Day5;

public class Library {
    private User user;


    public Library () {
        this.user = new User();
    }

    public void setUser (User user) {
        this.user = user;
    }


    public User getUser () {
        return this.user;
    }


}
