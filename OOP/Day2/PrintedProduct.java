package OOP.Day2;

// PrintedProduct is a generic class 
// that refers to a paper-made object on which text and/or images are printed 


public class PrintedProduct {

                        //as usual, let's define attributes and constructor

    private String paper_type;
    private Double width;
    private Double hight;
    private String text;

    public PrintedProduct(String paper_type, Double width, Double hight) {
        this.paper_type = paper_type;
        this.width = width;
        this.hight = hight;
        this.text = "";
    }

                        //and also the methods (in this case just 2 for example)



    public String get_text(){
        return this.text;
    }

    public void set_text( String text ){
        this.text = text;
    }
}
