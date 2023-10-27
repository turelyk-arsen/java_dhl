package OOP.Day1;

public class MainDog {
    public static void main(String[] args) {
        Dog fuffy = new Dog("fuffy", "dalmatian", "white and black");
        System.out.println(fuffy.getName());

        fuffy.setName("FUFFY");
        System.out.println(fuffy.getName());

        fuffy.bark();

        ExampleClass ex = new ExampleClass("hello", 10);
        System.out.println(ex.getAttr3());
        ex.setAttr3(true);
        System.out.println(ex.getAttr3());

        // PUBLIC
        System.out.println(fuffy.tail);
    }

}
