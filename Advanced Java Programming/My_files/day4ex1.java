import java.util.Scanner;

public class day4ex1 {

    public static void showProducts (String[] products, int[] price) {
        System.out.println("List products: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product number is " + (i+1) +". " + products[i]+ " with price " + price[i]);
        }
    }

    public static int askClientProduct () {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to buy enter the nubmer of the product!!");
        int product  = scan.nextInt();
        return product;
    }

    public static String askClientDiscount () {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to buy with discount enter: yes");
        String discount  = scan.nextLine();
        return discount;
    }

    public static boolean checkProdNum (String[] products) {
        int product = askClientProduct();

        boolean result;
        if (product <= products.length) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void calculate (int[] price, String[] products, double[] discount) {
        int product = askClientProduct();
        String disc = askClientDiscount();
        //boolean result = checkProdNum(products);

        if (product > products.length ) {
            System.out.println("This number of products doesn't exist. Try again!");
        }

        if (disc.equals("yes") && product <= products.length) {
            //double newPrice = price[product-1] * 0.5;
            double newPrice = price[product-1] * discount[product-1];
            System.out.println("Your discount is 50%." + " New price is " + newPrice);
        } else {
            System.out.println("You don't have a discount. Your price is " + price[product-1]);
        }
    }



    public static void main(String[] args) {
        String products[] = {"pizza", "pasta", "seafood"};
        int price[] = {5, 10, 20};
        double discount[] = {0.9, 0.5, 0.8};


        showProducts(products, price);
        calculate(price, products, discount);
    
    }
    
}
