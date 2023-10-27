package OOP.Day3.ex1;

public class Number {
    private double array[] = new double[10];
    private double avarage;
    private int position = 0;

    private void avarageCalc() {
        double sum = 0.0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            counter++;
        }
        this.avarage = sum / counter;
    }

    public void enterNumber (double n) {
        array[position] = n;
        position++;

        this.avarageCalc();
    }
}
