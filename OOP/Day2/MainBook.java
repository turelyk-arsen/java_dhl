package OOP.Day2;

// in this file we usethe parent class 'PrintedProduct' and the child class 'Book'
// the class files are in the same folder, so they are automatically found



public class MainBook {


    public static void main(String[] args) {


        // first we create an instance of PrintedProduct 

        PrintedProduct product = new PrintedProduct("light paper" , 75.0 , 105.0);

        // and we test it
        product.set_text("Hello World from a generic Printed Product");
        System.out.println("\n\n\n");
        System.out.println(product.get_text());
        System.out.println("\n\n\n");


        
        // then let's create and use an instance of Book

        Book book0 = new Book("heavy paper", 210.0, 297.0, "Tolkien", "tLotR", 1216);


        // of course we can use the methods present only in Book
        System.out.println(book0.get_title());
        System.out.println("\n\n\n");

        // but we can use also the inherited ones
        book0.set_text(" a lot of words. enough to fill 1216 pages ");
        System.out.println(book0.get_text());
        System.out.println("\n");

        Newspaper news = new Newspaper("very light", 299.0, 385.5);
        news.setArt(16);
        System.out.println(news.getArt());
        news.set_text("Spider-danger hits again!");
        System.out.println(news.get_text());
        
    }


    
}
