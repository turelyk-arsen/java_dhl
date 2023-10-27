import java.util.Scanner;

public class day2ex2 {

    public static void showMenu(String[] menu) {
        System.out.println("This is the menu: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }

    public static String getDish() {
        System.out.println("Enter the name of dish: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int checkMenu(String[] menu, String[] dish) {
        int index = -1;

        for (int i = 0; i < menu.length; i++) {
            if(menu[i].equals(dish)) {
                index= 1;
            }
        }
        return index;
    }

    public static int[] checkEx(int[] por, int index) {
        if(index == -1) {
            System.out.println("the dish's not in the menu");
        } else {
            if(por[index] > 0 ) {
                por[index]--;
            }
        }
        return por;
    }

    public static void loop (String[] menu, int[] portions) {
        do {         
         showMenu(menu);
         String value = getDish();
         int i = checkMenu(menu, value);
         portions = checkEx(portions, i);}

         while(true);
    }

    public static void main(String[] args) {
        String food[] = {"pizza", "sushi", "paeja"};
        int portions[] = {3, 3, 3};

        loop(food, portions);

       
    }
    
}
