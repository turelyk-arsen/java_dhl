import java.util.Scanner;

public class day5ex1 {

    public static String[] getBook() {

        Scanner scan = new Scanner(System.in);
        String book[] = new String[4];

        System.out.print("Enter the book name :");
        book[0] = scan.nextLine();
        //System.out.println("\n");

        System.out.print("Enter the book author :");
        book[1] = scan.nextLine();
        //System.out.println("\n");

        System.out.print("Enter the book gender :");
        book[2] = scan.nextLine();
        //System.out.println("\n");

        System.out.print("Enter the book page :");
        book[3] = scan.nextLine();
        //System.out.println("\n");

        return book;

    }

    public static String[][] setBook(String[][] booksList, String[] tempBook, int index) {

            booksList[index] = tempBook;

        return booksList;
    }

    public static String[][] getBooks(String booksList[][]) {
        //String booksList[][] = new String[20][4];

        String tempBook[] = getBook();
        int index = 0;

        for (int i = 0; i < 20; i++) {
            if(booksList[i][0] == null){
                  index = i;  
                  i = 20;
            }
        }
        booksList = setBook(booksList, tempBook, index);

        return booksList;
    }

    public static void showBooksList(String[][] booksList) {
        System.out.println("Your list of books has 20 books: ");
        //System.out.println("Empty fields. You can add new book.");

        for (int i = 0; i < booksList.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (booksList[i][j] != null) 
                System.out.print(booksList[i][j] + " / ");
            } 
            if(booksList[i][0] != null)
                System.out.println("");
     
        }
    }

        public static void menu() {
            System.out.println("Enter 1 to select - show list of books");
            System.out.println("Enter 2 to select - add new book to the list of books");
            System.out.println("Enter 3 to select - search book in the list of books");
            System.out.println("Enter 4 to select - delete book");

        }

        public static int getOption () {
            Scanner scan = new Scanner(System.in);
            System.out.print("I select option: ");
            return scan.nextInt();
        }

        public static void searchBook(String[][] booksList) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Id like to find: ");
            String search = scan.nextLine();

            for (int i = 0; i < booksList.length; i++) {
                for (int j = 0; j < 4; j++) {
                    if( booksList[i][j] != null && booksList[i][j].equals(search)) {
                        for (int k = 0; k < 4; k++) {
                        System.out.print(booksList[i][k] + " / "); 
                    }
                    System.out.println("\n");
                    }
                }
            }
        }

        public static void deleteBook(String[][] booksList) {
            Scanner scan = new Scanner(System.in);
            System.out.print("I want to delete the book: ");
            String search = scan.nextLine();

            for (int i = 0; i < booksList.length; i++) {
                    if( booksList[i][0] != null && booksList[i][0].equals(search)) {
                        for (int k = 0; k < 4; k++) {
                        booksList[i][k] = null;
                        } 
                    } 
            }
        }
    
    public static void main(String[] args) {
        String booksList[][] = new String[20][4];

        //booksList = getBooks();


        do {
            System.out.println("This is a library shop. The user can add new books with informations: author, number of pages and genre.");
            menu();
            int option = getOption();

            switch (option) {
            case 1:
            showBooksList(booksList);
            break;
            case 2:
            getBooks(booksList);
            break;
            case 3:
            searchBook(booksList);
            break;
            case 4:
            deleteBook(booksList);
            break;
            default:
            System.out.println("Not action");
            break;
            }
        } while (true);

    }
}
