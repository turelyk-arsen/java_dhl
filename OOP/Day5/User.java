package OOP.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    private String userName;
    private String favoriteGanre;
    private int bookNumber;
    private Book book;
    private List<Book> listBook = new ArrayList<>();


    public User () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. To get books from our library you have to add your name: ");
        this.userName = scan.nextLine();
        System.out.println("Enter your favorite ganre of book: ");
        this.favoriteGanre = scan.nextLine();

        this.bookNumber = 0;
        
    }


    public void setUserName (String userName) {
        this.userName = userName;
    }
    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGanre = favoriteGenre;
    }
    public void setBookNumber (int bookNumber) {
        this.bookNumber = bookNumber;
    }


    public String getUserName() {
        return userName;
    }
    public String getFavoriteGanre() {
        return favoriteGanre;
    }
    public int getBookNumber() {
        return bookNumber;
    }
    public Book getBook () {
        return book;
    }
    public List<Book> getListBook () {
        return listBook;
    }

    public void add() {
        Book book = new Book();
        listBook.add(book);
        //bookNumber++;
    }



    
}
