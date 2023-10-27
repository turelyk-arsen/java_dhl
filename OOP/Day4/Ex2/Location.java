package OOP.Day4.Ex2;

import java.util.Scanner;

public class Location {
    private String locName;
    private String locAddress;
    private String locMark;
    private String note;
    
    public Location() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entey your name: ");
        this.locName = scan.nextLine();

        System.out.println("Enter address: ");
        this.locAddress = scan.nextLine();

        this.locMark = "no marks";
        this.note = "no note";
    }



    public String getLocName() {
        return locName;
    }

    public String getLocAddress() {
        return locAddress;
    }

    public String getLocMark() {
        return locMark;
    }

    public String getNote() {
        return note;
    }



    public void setLocName(String locName) {
        this.locName = locName;
    }

    public void setLocAddress(String locAddress) {
        this.locAddress = locAddress;
    }

    public void setLocMark(String locMark) {
        this.locMark = locMark;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public void printInfo() {
        System.out.println("name " + getLocName() + " address " + getLocAddress());
    }


    
    
}
