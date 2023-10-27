package OOP.Day2.ex1;

public class Hotdogs extends Meat {
    private int quantity;
    private boolean skin;
    private double size;

    public Hotdogs (String animal, int quantity) {
        super(animal, false);

        this.quantity = quantity;
        this.size = 0.0;
        this.skin = true;
    }
    
    @Override
    public void setCut(String cut) {
        super.setCut("The cut may be " + cut + " but probably is something strange");
    }

    @Override
    public void getInfo() {
        super.getInfo();

        System.out.println("Quantity " + quantity);
        System.out.println("Size " + size);
        System.out.println("Skin " + skin);
    }

}
