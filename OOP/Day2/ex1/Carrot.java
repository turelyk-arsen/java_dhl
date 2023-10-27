package OOP.Day2.ex1;

public class Carrot extends Vegetable {
    private String description;
    
    public Carrot (int quantity, int weight, String description) {
        super(quantity, weight);
        this.description = description;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override 
    public void getInfo() {
        super.getInfo();
        System.out.println("The carrot is " + description);
    }

}
