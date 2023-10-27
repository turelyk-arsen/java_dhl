import java.util.Scanner;

public class login {

    public static void getText(String text) {

        Scanner text_scan = new Scanner(System.in);
        String entered;

        do {
            System.out.println("Enter the correct value: ");
            entered = text_scan.nextLine();
        } while (!entered.equals(text));
    }

    public static String askOP() {
        Scanner op_scanner = new Scanner(System.in);
        String op;

        do{ 
            System.out.println("enter the operation name: ");
            op = op_scanner.nextLine();

        } while (!op.equals("logout") && !op.equals("change"));

        return op;
    }

    public static String modifyPw() {
        Scanner text_scan = new Scanner(System.in);
        System.out.println("enter new password: ");
        return text_scan.nextLine();

    }

    public static void login_function(String username, String password) {
        String op;


        getText(username);
        getText(password);

        op = askOP();

        if(op.equals("change")) {
            password = modifyPw();
        } 
    }

    public static void main(String[] args) {
     login_function("fra", "fra");   
    }
    
}
