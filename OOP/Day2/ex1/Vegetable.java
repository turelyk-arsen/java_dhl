package OOP.Day2.ex1;

public class Vegetable extends Food{
    private int quantity;
    private int weight;
    private boolean cook;

    public Vegetable(int quantity, int weight) {
        this.quantity = quantity;
        this.weight = weight;
        this.cook = true;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public void getInfo() {
        System.out.println("Quantity " + quantity);
        System.out.println("Weight " + weight);
        System.out.println("Cook  " + cook);
    }
    
}
