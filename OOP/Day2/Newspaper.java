package OOP.Day2;

public class Newspaper extends PrintedProduct{
    private int col;
    private int art;
    private int images_n;
    private int pages_n;

    public Newspaper (String paper_type, Double width, Double hight) {
        super(paper_type, width, hight);


    }


    public void setArt(int n) {
        this.art = n;
    }
    public int getArt () {
        return this.art;
    }

}
