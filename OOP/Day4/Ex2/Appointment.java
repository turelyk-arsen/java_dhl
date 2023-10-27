package OOP.Day4.Ex2;

import java.util.Scanner;

public class Appointment {
    private String day;
    private String time;
    private Location location;
    private Date date;


    public Appointment () {
        Scanner scan = new Scanner(System.in);

        this.date = new Date();
        this.location = new Location();

        System.out.println("Enter day: ");
        this.day = scan.nextLine();
        System.out.println("Entre time: ");
        this.time = scan.nextLine();
    }


    public String getDay() {
        return day;
    }
    public String getTime() {
        return time;
    }
    public Location getLocation() {
        return location;
    }
    public Date getDate() {
        return this.date;
    }


    public void setDay(String day) {
        this.day = day;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public void printDay() {
        System.out.println("day " + getDay() + "location" );
        location.printInfo();
        date.printInfo();
    }
}
