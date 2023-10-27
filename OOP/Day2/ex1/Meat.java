package OOP.Day2.ex1;

public class Meat extends Food {
    private String animal;
    private String type;
    private boolean fish;
    private String cut;

    public Meat (String animal, boolean fish) {
        this.animal = animal;
        this.fish = fish;
        this.type = "unknown";
        this.cut = "unknown";
    }

    public void setType( String type) {
        this.type = type;
    }
    public void setCut( String cut) {
        this.cut = cut;
    }
    public void getInfo() {
        System.out.println("Animal is " + animal);
        System.out.println("Type is " + type);
        System.out.println("Cut is " + cut);
        System.out.println("Fish is " + fish);
    }

}
