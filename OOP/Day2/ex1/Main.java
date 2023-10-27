package OOP.Day2.ex1;

public class Main {
    public static void main(String[] args) {

        Meat fish = new Meat("salman", true);
        fish.setType("Sea fat fish meat");
        fish.setCut("fillet");
        fish.getInfo();

        System.out.println("\n");

        Steaks steaks = new Steaks("beef", 2.5);
        steaks.setBone(false);
        steaks.setType("red meat");
        steaks.addCarrot();
        steaks.getInfo();


        System.out.println("\n");

        Hotdogs hotdogs = new Hotdogs("Pig", 5);
        hotdogs.setCut("fillet");
        hotdogs.getInfo();


    }
}
