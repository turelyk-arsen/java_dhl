import java.util.stream.IntStream;

public class MyFirstClass {

	public int num1 = 1;
	private int num2 = 1;

	//overload
	public MyFirstClass (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public MyFirstClass() {
		this.num1 = 10;
		this.num2 = 20;
	}

	public int getNum () {
		return num2;
	}

	public void setNum(int newNum) {
		this.num2=newNum;
	}

	public static void newFor() {

		IntStream.range(0, 10).forEach(System.out::println);
	}

	public static void main (String... args) {
//		System.out.println("Hello world!!!");
//		newFor();
		MyFirstClass newClass = new MyFirstClass(3,2);
		MyFirstClass newCls = new MyFirstClass();

	}

}
