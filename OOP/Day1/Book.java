package OOP.Day1;

public class Book {

    ///////////////////////
    private String title;
    private String author;
    private String edition;
    private String genre;
    private int pages;
    private double price;

    /////////////////////////////////////////////////////////////
    public Book(String title, String author, double price) {
        this.title= title;
        this.author = author;
        this.price = price;

        this.edition = "unknown";
        this.genre = "unknown";
        this.pages = -1;
    }

    public String getTitle () {
        return title;
    }
    public String getAuthor () {
        return author;
    }
    public double getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
        System.out.println(this.edition);
        System.out.println(this.genre);
        System.out.println("Pages " + this.pages);
        System.out.println(this.getPrice());
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setOptional( String edition, String genre, int pages) {
        this.edition = edition;
        this.genre = genre;
        this.pages = pages;
    }

}
