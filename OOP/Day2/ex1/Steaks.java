package OOP.Day2.ex1;

public class Steaks extends Meat {
    private double thick;
    private double weight;

    private boolean bone;

    public Steaks (String animal, double weight) {
        super(animal, false);

        this.weight = weight;
        this.thick = 0.0;
        this.bone = true;
    }

    public void setThick(double thick) {
        this.thick = thick;
    }
    public void setBone(boolean bone) {
        this.bone = bone;
    }

    public void addCarrot() {
        Carrot carrot = new Carrot(1, 5, "delicios");
        carrot.getInfo();
    }

    @Override
    public void getInfo() {
        super.getInfo();

        System.out.println("Thick " + thick);
        System.out.println("Weight " + weight);
        System.out.println("Bone  " + bone);

    }


}
