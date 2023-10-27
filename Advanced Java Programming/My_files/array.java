// import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class array {
    
    public static void main(String[] args) {
        //Int numbers[] = new int[3];
        // Int number[] = {4,5,6,7};
        //ArrayList<String> yourList = new ArrayList

        // Scanner scan = new Scanner(System.in);

        String students[] = {"Carlo", "Adam", "Bob"};
        int numbers[] = {1, 2, 4};

        //System.out.println(students[0]);
        System.out.println(students.length);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        int foud = -1;

        for (int i=0; i < numbers.length; i++) {
            System.out.println("the index is " + i + " and the element is " + numbers[i] + " the name is " + students[i]);

            if (students[i].equals("Bob")) {
                System.out.println(i);
                foud =i;
            }

            if( foud == -1) {
                System.out.println("The element is not in the memory");
            } else {

                System.out.println("The element has index " + foud);
            }

        }

        // Arrays.sort(students);  // ASC
        Arrays.sort(students, Collections.reverseOrder()); // DESC
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\n");
        System.out.println("OVER");

        
    }
}
