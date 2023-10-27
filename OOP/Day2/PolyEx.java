package OOP.Day2;

public class PolyEx {
    public static void print(String text) {
        System.out.println("I am printing text " + text);
    }

    public static void print(int number) {
        System.out.println("I am printing number " + number);
        System.out.println("number * 10 = " + number*10);

    }

    public static void main(String[] args) {
        print("Hello");
        print(5);
    }


}
