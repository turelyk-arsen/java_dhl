package OOP.Day1.ex3;

public class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Woow!");
    }
}
