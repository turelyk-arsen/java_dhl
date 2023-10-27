package OOP.Day2;

// Book is the child class of PrintedProduct
// Book inherits all the attributes and methods in PrintedProduct 



public class Book extends PrintedProduct  {
    

    //              ----------------------------------------------------------------------------------

   

                                // all the attributes in PrintedProduct are inherited
                                // so we have to add only the ones present in book but not in PrintedProduct 

    private String author;
    private String title;
    private int n_pages;

    

    //              ----------------------------------------------------------------------------------

   

                                // Even if not visible, all the attributes in PrintedProduct are inherited
                                // this means that we have to take them into account

    public Book(  String paper_type, Double width, Double hight, String author, String title, int n_pages){

                                // we cannot use directly the attributes inherited because they are private
                                // however, we can use the keyword 'super'
        
                                // let's use 'super()' to inizialise the inherited attributes
                                // in this way we use the PrintedProduct constructor
        super(paper_type, width, hight);

                                // then we can use 'this' to select the attributes introduced in this child class
        this.author = author;
        this.title = title;
        this.n_pages = n_pages;
    }


    

    //              ----------------------------------------------------------------------------------


                                //after the constructor, we can introduce also new methods
    

    public String get_title(){
        return this.title;
    }

    public void set_title(String title){
        this.title = title;
    }

   
    
}
