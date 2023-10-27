package OOP.Day3.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private String name;
    private String surName;
    private int age;
    private double[] grade = new double[10];

    // exercise 2 add avarage grade
    private double avarage = 0;

    /// attribudes for constructor
    public Student () {
        this.name = "unknown";
        this.surName = "unknown";
        this.age = 0;
        
        for (int i = 0; i < this.grade.length; i++) {
            this.grade[i] = 0;
        }
    }


    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type the student name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter the student surname: ");
        this.surName = scanner.nextLine();

        try {
        System.out.println("Enter the student age: ");
        this.age = scanner.nextInt();
        } catch (InputMismatchException e) {
        System.out.println("Value not allowed.");  
          }
    }

    public void getInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surName);
        System.out.println("Student age: " + this.age);
    }

    public void getGrades() {
        double sum = 0;
        double result;
        int num = 0;

        for (int i = 0; i < this.grade.length; i++) {
            System.out.println("Student value namber " + (i+1) + " is " + grade[i]);
            sum += grade[i];
            if(grade[i] != 0) {
                num++;
            }

        }  
               try {
            result = sum/(num);
            System.out.println("Average grade is: " + result);  
            } catch (NullPointerException e) {
                System.out.println("You don't have grades.");
            }
   //         System.out.println("AVARAGE" + avarage);
    }

    public void setGrades(int i) {
        Scanner newScanner = new Scanner(System.in);
        String empty;
        boolean allowed = true;

        do {
            allowed = true;
            try {
            System.out.println("Enter student grades: ");
                this.grade[i]=newScanner.nextDouble();
        } catch (InputMismatchException e) {
            empty = newScanner.nextLine();
            allowed = false;
            System.out.println("Valuation not allowed.");
        } 
        } while (!allowed);
   //     avarage = avarageCalc();
    }

    public void setValuation() {
        boolean found = true;
        int position = -1;

        for (int i = 0; i < grade.length; i++) {
            if (this.grade[i] == 0) {
                position = i;
                i = grade.length;
            }
        }

        if(position == -1) {
            System.out.println("The grades list is full");
        } else {
            setGrades(position);
        }

    }

    private double avarageCalc() {
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        return sum/grade.length;
    }

}
