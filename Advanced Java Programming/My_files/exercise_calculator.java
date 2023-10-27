import java.util.Scanner;

public class exercise_calculator {

    public static void menu() {
        System.out.println("+ addition");
        System.out.println("- subtraction");
        System.out.println("* multiplication");
        System.out.println("/ division");
        System.out.println("to exit write end");

    }

    public static String askOP() {
        Scanner op_scanner = new Scanner(System.in);
        String op;

        do{ 
            System.out.println("enter the operation symbol: ");
            op = op_scanner.nextLine();

        } while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("end"));

        return op;
    }
    
    public static int getNumber() {
        Scanner num_scanner = new Scanner(System.in);
        System.out.println("enter a integer number: ");
        return num_scanner.nextInt();
    }

    public static double getResult(String operation, int n1, int n2) {

            switch (operation) {
                case "+":
                return n1 + n2;
                case "-":
                return n1 - n2;
                case "*":
                return n1 * n2;
                case "/" :
                return n1 / n2;
                // case "end" :
                // System.out.println("bye");
                // break;
                // default:
                // System.out.println("operation not recogniced");
                // break;
                default:
                return -1;
            }
    }

    public static void calc() {
        String op;
        int n1;
        int n2;
        
        do {
        menu();
        op = askOP();
        if (!op.equals("end")) {
        System.out.println("enter the first value");
        n1 = getNumber();
        System.out.println("enter second number");
        n2 = getNumber();
        System.out.println("the result is: " + getResult(op, n1, n2));}
        } while (!op.equals("end"));


    }

    public static void main(String[] args) {
        
        calc();
    }
}
