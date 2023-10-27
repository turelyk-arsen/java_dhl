package OOP.Day1;

public class ExampleClass {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public ExampleClass (String attr1, int attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = false;
    }

    public boolean getAttr3 () {
        return attr3;
    }

    public void setAttr3 (boolean value) {
        this.attr3 = value;
    }
}
