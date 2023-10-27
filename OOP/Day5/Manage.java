package OOP.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    
    private List<Library> userLibrary = new ArrayList<>();

    public void add () {
        Library library = new Library();
       // if (userLibrary.isEmpty())   
       System.out.println("Add new user!");
       userLibrary.add(library);
        }

    public void addBook () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String userName = scan.nextLine();

        for (int i = 0; i < userLibrary.size(); i++) {
           
        if (userName.equals(userLibrary.get(i).getUser().getUserName())) {
            
            int count = userLibrary.get(i).getUser().getListBook().size() +1;

            if (count <= 2) {
                userLibrary.get(i).getUser().add();
                System.out.println("You've already taken " + count + " The total count of books is 20.");
            }             
            else
            System.out.println("You can take only 20 books form the library!");
        }  
        }
 
    }

    
    

    public void show () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String userName = scan.nextLine();

        if (userLibrary.isEmpty()) {
            System.out.println("Library empty.");
        } else {
          
            for (int i = 0; i < userLibrary.size(); i++) {
                if (userName.equals(userLibrary.get(i).getUser().getUserName())) {
                    int bookListSize = userLibrary.get(i).getUser().getListBook().size();
                    for (int j = 0; j < bookListSize; j++) {
                        userLibrary.get(i).getUser().getListBook().get(j).getBookInfo();
                    }  
                }
            }
        }
    }
    

    public void searchBook () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String userName = scan.nextLine();
        System.out.println("Enter the book name: ");
        String bookName = scan.nextLine();

         
            for (int i = 0; i < userLibrary.size(); i++) {
                if (userName.equals(userLibrary.get(i).getUser().getUserName())) {
                    int bookListSize = userLibrary.get(i).getUser().getListBook().size();
                    
                    for (int j = 0; j < bookListSize; j++) {
                            if(bookName.equals(userLibrary.get(i).getUser().getListBook().get(j).getBookName()))
                             userLibrary.get(i).getUser().getListBook().get(j).getBookInfo();
                    }  
                }
            }
        
    }
}
