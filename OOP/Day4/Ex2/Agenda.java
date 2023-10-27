package OOP.Day4.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    
    private List<Appointment> agenda = new ArrayList<>();

    public void add() {
        Appointment appointment = new Appointment();
        agenda.add(appointment);
    }

    public void show() {
        if (agenda.isEmpty()) {
            System.out.println("NO date");
        } else {
            for (int i = 0; i < agenda.size(); i++) {
                agenda.get(i).printDay();
            }
        }
    }

    public void showDay(String day) {
        if (agenda.isEmpty()) {
            System.out.println("NO date");
        } else {
            for (int i = 0; i < agenda.size(); i++) {
                if (agenda.get(i).getDay().equals(day))
                    agenda.get(i).printDay();
            }
        }
    }

    public void editDay(String day) {
        if (agenda.isEmpty()) {
            System.out.println("NO date");
        } else {
            for (int i = 0; i < agenda.size(); i++) {
                if (agenda.get(i).getDay().equals(day)) {
                    agenda.get(i).printDay();

                    System.out.println("Enter new day");
                    Scanner scan = new Scanner(System.in);
                    String newDay = scan.nextLine();
                    agenda.get(i).setDay(newDay);

                }
                    
                
            }
        }
    }

    public void showPerson(String person) {
        if (agenda.isEmpty()) {
            System.out.println("NO date");
        } else {
            for (int i = 0; i < agenda.size(); i++) {
                if (agenda.get(i).getDate().getName().equals(person))
                    agenda.get(i).printDay();
            }
        }
    }




 
}
