package OOP.Day1;

public class Dog {

    //define attributes
    private String name;
    private String race;
  //  private double size;
    private String color;
   public int tail = 100;
    private String peculiarities;

    // defined method --- function
    // constructor
    public Dog(String passed_name, String race, String color) {
        this.name = passed_name;
        this.race = race;
        this.color = color;
        this.peculiarities = "none";
    }

    public String getName () {
        return this.name;
    }

    public String getRace () {
        return race;
    }

    public String getColor() {
        return color;
    }

    public String getPecul() {
        return peculiarities;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("woof!!!");
    }
}
