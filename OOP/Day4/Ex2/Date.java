package OOP.Day4.Ex2;

import java.util.Scanner;

public class Date {

    private String name;
    private String gender;
    private String tel;
    private String address;


    public Date() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entey your name: ");
        this.name = scan.nextLine();

        System.out.println("Enter tel number: ");
        this.tel = scan.nextLine();

        this.gender = "who cares";
        this.address = "somewhere";
    }

    public String getName() {
        return this.name;
    }
    public String getGender() {
        return this.gender;
    }
    public String getAddress() {
        return this.address;
    }
    public String getTel() {
        return this.tel;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setGender (String gender) {
        this.gender = gender;
    }
    public void setAddress( String address) {
        this.address = address;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }


    public void printName() {
        System.out.print(getName());
    }
    public void printAddress() {
        System.out.print(getAddress());
    }
    public void printGender() {
        System.out.print(getGender());
    }
    public void printTel() {
        System.out.print(getTel());
    }

    public void printInfo() {
        System.out.println("Name: " );
        printName();
    }
}
