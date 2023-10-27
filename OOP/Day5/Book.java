package OOP.Day5;

import java.util.Scanner;

public class Book {
    
    private String bookAuthor;
    private String bookName;
    private int bookPage;
    private String bookGenre;
    
    public Book () {
        Scanner scan = new Scanner(System.in);

        System.out.println("You have to add info about a book: ");
        System.out.println("Author name is ");
        this.bookAuthor = scan.nextLine();

        System.out.println("The name of the book is ");
        this.bookName = scan.nextLine();

        System.out.println("Add the genre of your book: ");
        this.bookGenre = scan.nextLine();

        System.out.println("Number of the page is ");
        this.bookPage = scan.nextInt();
    }


    public void setBookAuthor (String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public void setBookName( String bookName) {
        this.bookName = bookName;
    }
    public void setBookPage (int bookPage) {
        this.bookPage = bookPage;
    }
    public void setBookGenre (String bookGenre) {
        this.bookGenre = bookGenre;
    }


    public String getBookAuthor () {
        return this.bookAuthor;
    }
    public String getBookName () {
        return this.bookName;
    }
    public int getBookPage () {
        return this.bookPage;
    }
    public String getBookGenre() {
        return this.bookGenre;
    }

    public void getBookInfo () {
        System.out.println("Author: " +  getBookAuthor() + 
        " book: " + getBookName() + " page: " + getBookPage()
        + " genre: " + getBookGenre());
    }

}
