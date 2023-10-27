import java.util.Scanner;

public class day2_ex2 {
    String dishes[] = {"1 dish", "2 dish", "3 dish", "4 dish", "5 dish", "6 dish"};
    int number_dishes[] = {3, 3, 3, 3, 3, 3};
    
    public static String enterDish () {
        String dishes[] = {"1 dish", "2 dish", "3 dish", "4 dish", "5 dish", "6 dish"};
        int number_dishes[] = {3, 3, 3, 3, 3, 3};

        System.out.println("List of dish: ");
        for (int i = 0; i < dishes.length; i++) {
            System.out.println(dishes[i]);
        }
        System.out.println("Enter the name of dish: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    } 

    public static void check() {
        String dishes[] = {"1 dish", "2 dish", "3 dish", "4 dish", "5 dish", "6 dish"};
        int number_dishes[] = {3, 3, 3, 3, 3, 3};

        for (int i = 0; i < dishes.length; i++) {
            if(dishes[i] == enterDish()) {
                if(number_dishes[i] <= 3) {
                    number_dishes[i] = number_dishes[i] - 1;
                    System.out.println("Wait your dish");
                } else {
                    enterDish();
                }
            } else {
                enterDish();
            }
        }

    }
    public static void main(String[] args) {
        check();
    }
}
