import java.util.Scanner;
import java.util.Arrays;

public class students_register {

    public static String getName() {
        System.out.print("Enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void getList() {
        String students[] = new String[6];
        for (int i = 0; i < students.length; i++) {
            students[i] = getName();
        }

        Arrays.sort(students);
        System.out.println("Sorted names: ");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    // public static String[] returnArray(String[] array) {
    //     Arrays.sort(array);
    //     return array;
    // }
  

    public static void main(String[] args) {
        getList();
    }
    
}
