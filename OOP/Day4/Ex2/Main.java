package OOP.Day4.Ex2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Agenda myAgenda = new Agenda();
        boolean run = true;

    do {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select the number 1-add, 2-show all, 3-show dat, 4-show person, 6-edit day");
        String answer = scan.nextLine();

        switch (answer) {
            case "1":
                myAgenda.add();
            break;

            case "2":
                myAgenda.show();
            break;

            case "3":
            System.out.println("what's day");
            String day = scan.nextLine();
            myAgenda.showDay(day);
            break;

            case "4":
            System.out.println("what's person");
            String person = scan.nextLine();
            myAgenda.showDay(person);
            break;

            case "5":
            run = false;
            break;

            case "6":
            System.out.println("what's day");
            String anotherday = scan.nextLine();
            myAgenda.editDay(anotherday);
            break;

            default:
            System.out.println("WRONG");
            break;
        }
         } while (run);



    }
}
