
import java.util.Scanner;

public class allYouCanEat {

    public static void showMenu () {
        String menu = "\n\n\n 101 - salmon nigiri \n 102 - tuna nigiri \n 103 - salmon maki \n 104 - tuna maki \n 105 - avocado maki \n\n\n\n";
        System.out.println(menu);
    }

    public static String askClient() {
        Scanner scanner = new Scanner(System.in);
        String selection = "";
        System.out.println( "\n\n\n Do you want to order? [y / n]: " );
        selection = scanner.nextLine();
        return selection;
    }

    public static String dishSelect () {
        Scanner scanner = new Scanner(System.in);
        String dish = "";
        System.out.print( " Write the dish code: " );
        dish = scanner.nextLine();
        return dish;
    }

    public static int dishNum () {
        Scanner scanner = new Scanner(System.in);
        int dish_num = 0;

        System.out.print( " Do you want to continue? [y / n]: " );
        String selection = scanner.nextLine();

        if (selection.equals("n")){
            dish_num = 10 ;
        } else {    // y means that I want to continue the current order
            if (selection.equals("y")){
                dish_num++;
            } else {    // here I check if the selection of the order question is y or n
                System.out.print( " Try again " );
            }
        }
        return dish_num;
        
    }

public static void main(String[] args) {

    // Scanner creation
    //Scanner scanner = new Scanner(System.in);
    
    // Menu Creation
    //String menu = "\n\n\n 101 - salmon nigiri \n 102 - tuna nigiri \n 103 - salmon maki \n 104 - tuna maki \n 105 - avocado maki \n\n\n\n";

    // Dish variables creation
    //String dish = "";
    int dish_num = 0;
    String order = "";

    // Selection variable creation
    //String selection = "";

    // bill variable Creation
    Boolean bill = false;

    // THE ENTIRE PROCESS
    do {
        //System.out.println( "\n\n\n Do you want to order? [y / n]: " );
        //selection = scanner.nextLine();
        String selection  = askClient();
        showMenu();
        // n means that I want to quit
        if (selection.equals("n")){
            bill = true ;
        } else {    // y means that I want to order 
            if (selection.equals("y")){
                
                // reset the number of dishes
                dish_num = 0;


                // CHECK NUMBER OF DISHES
                while (dish_num < 3) {
                    String dish = dishSelect();
                    // DISH SELECTION
                    //System.out.println( menu );
                    //System.out.print( " Write the dish code: " );
                    //dish = scanner.nextLine();
                    // END DISH SELECTION

                    // add the dish in the order
                    order = order + "\n" + dish ;
                    dish_num = dishNum();
                    //System.out.print( " Do you want to continue? [y / n]: " );
                    //selection = scanner.nextLine();
                        // n means that I want to quit the current order
                    //if (selection.equals("n")){
                      //  dish_num = 10 ;
                    //} else {    // y means that I want to continue the current order
                      //  if (selection.equals("y")){
                        //    dish_num++;
                        //} else {    // here I check if the selection of the order question is y or n
                          //  System.out.print( " Try again " );
                       // }
                    //}
            
                }
                // END CHECK NUMBER OF DISHES

                System.out.print( order );

                // reset the orther
                order = "";


            } else {  // here I check if the selection of the first question is y or n
                System.out.print( " Try again " );
            }
        }

    } while (! bill);
    // END OF THE ENTIRE PROCESS

}


    
}
