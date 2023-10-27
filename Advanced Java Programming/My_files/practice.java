import java.util.Scanner;

public class practice {

    // public static String message() {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("what is your name");
    //     String new_mess = scan.nextLine();
    //     return new_mess;
    // }

    public static int sum(int n1, int n2) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("what is your name");
        // String new_mess = scan.nextLine();
        return n1 + n2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("the first number:");
        int n1 = scan.nextInt();


        System.out.print("the second number:");
        int n2 = scan.nextInt();

        System.out.println("The result is:");

        System.out.println(sum(n1, n2));
        System.out.println("program is over");
    }

    

}
