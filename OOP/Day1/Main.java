package OOP.Day1;

public class Main {
    
    public static void main(String[] args) {
        Book tlotr = new Book("The lord of the rings", "Tolkien", 25.99);

        System.out.println(tlotr);
        tlotr.getInfo();

        tlotr.setAuthor("J.R. Tolkien");
        tlotr.getInfo();

        tlotr.setOptional("1st", "fantasy", 1178);
        tlotr.getInfo();
        
        Book hp = new Book("Harry Potter", "Roling", 0.99);
        hp.getInfo();
        hp.setOptional("32nd", "fantasy", 56);
        hp.getInfo();

        System.out.println(tlotr);
        System.out.println(hp);
        
    }
}
