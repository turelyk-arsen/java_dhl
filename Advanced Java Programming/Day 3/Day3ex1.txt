import java.util.Scanner;

public class Day3ex1 {

    // this function is used to get a product by input
    public static String[] getProduct(){

        Scanner prodScan = new Scanner(System.in);
        String product[] = new String[3];

        System.out.print("Enter the product name: ");
        product[0] = prodScan.nextLine();
        System.out.println("\n\n ");
        System.out.print("Enter the product price: ");
        product[1] = prodScan.nextLine();
        System.out.println("\n\n ");
        System.out.print("Enter the product quantity: ");
        product[2] = prodScan.nextLine();
        System.out.println("\n\n ");

        return product;

    }

    public static String[][] setProduct(String[][] matrix , String[] array , int index){
        for (int i = 0; i < 3; i++) {
            matrix[i][index] = array[i];   
        }

        return matrix;
    }

    public static String[][] getInvent(){

        String invent[][] = new String[3][9];

        String tempProd[] = getProduct();

        invent = setProduct(invent, tempProd, 0);

        return invent;

    }

    public static void showInvet(String[][] matrix , int number){

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i]+"  /  ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    public static void menu( String op1 , String op2 , String op3){

        System.out.println("Enter 1 to select - "+op1);
        System.out.println("Enter 2 to select - "+op2);
        System.out.println("Enter 3 to select - "+op3);
        
    }

    public static int getOption(){
        Scanner opScan = new Scanner(System.in);
        System.out.print("Option:  ");
        return opScan.nextInt();
    }

    public static String getValue(){
        Scanner valueScan = new Scanner(System.in);
        
        return valueScan.nextLine();
    }

    private static int getColumn(String[][] matrix , String name , int number){
        int found = -1;
        for (int i = 0; i < number; i++) {
            if (matrix[0][i].equals(name)) {
                found = i;
                i = number;
            }
        }
        return found;
    }


    public static void main(String[] args) {

        int column = 0;
        String name = "";
        String tempProd[] = new String[3];
        String inventory[][] = getInvent();
        int numProducts = 1;

        do {
            System.out.println("\n\n");
            showInvet(inventory, numProducts);
            
            menu("add product", "set quantity", "check disponibility");

            int option = getOption();
            System.out.print("\n\n\n");
        
            switch (option) {
                case 1:
                    tempProd = getProduct();
                    inventory = setProduct(inventory, tempProd, numProducts);
                    numProducts++;
                    break;

                case 2:
                    System.out.print("Enter the product name: ");
                    name = getValue();  
                    column = getColumn(inventory, name, numProducts);
                    if (column != -1){
                        System.out.println("The current quantity is "+ inventory[2][column]);
                        System.out.print("Enter the new quantity: ");
                        inventory[2][column] = getValue();
                    }else{
                        System.out.println("Product absent ");
                    }
                    
                    break;

                case 3:
                    System.out.print("Enter the product name: ");
                    name = getValue();  
                    column = getColumn(inventory, name, numProducts);
                    if (column != -1){
                        System.out.println("The current quantity is "+ inventory[2][column]);
                    }else{
                        System.out.println("Product absent ");
                    }
                    break;

                default:
                    System.out.println("Selection not recognized");
                    break;
            } 
        } while (true);
    }
    
}
