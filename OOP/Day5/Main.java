package OOP.Day5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manage myManage = new Manage();
        boolean run = true;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Select the number 1-add, 2-book, 3-show all, 4-search book, 5 - exit");
            String answer = scan.nextLine();

            switch (answer) {
                case "1":
                    myManage.add();
                break;

                case "3":
                    myManage.show();
                break;

                case "2":
                    myManage.addBook();
                break;

                case "4":
                myManage.searchBook();
                break;

                case "5":
                    run = false;
                break;
            
                default:
                System.out.println("Wrong!!!");
                    break;
            }

        } while (run);

    }
    
}
