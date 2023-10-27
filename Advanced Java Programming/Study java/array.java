import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class array {
	
	public static void first() {
		int[] num = {1, 2, 4};
		String[] str = {"My", "name"};
		System.out.println(str[1]);
		
		int len = num.length;
		System.out.println(len);
		
		int[] num2 = new int[5];
		// in empty array int = 0, String = null, boolean = false;
		System.out.println(num2[1]);
		num2[0] = 999;
		System.out.println(num2[0]);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		String strMy = "Hello";
		char[] newStr = strMy.toCharArray();
		for (int i =0; i<newStr.length; i++) {
			System.out.println(newStr[i]);
		}
		
		int res1 = strMy.indexOf("e", 0);
		System.out.println("search in STRING " + res1);
		
		String newStrMy = strMy.replace("Hello", "World hello!!!");
		System.out.println(newStrMy);
		System.out.println(strMy);
		

	}
	
	public static void starExercise () {
		
		for (int j = 0; j <3; j++) {
			System.out.println("");
			for (int i = 0; i < 5; i++) {
				System.out.print("* ");	
			}
		}
	}
	
	public static void numberFibonachi() {
		int num1 = 1;
		int num2 = 1;
		int num3;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 0; i < 10; i++) {
			num3 = num1 + num2; 
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
	
	public static void myMatrix() {
		int[][] array = new int[2][2];
		
		for (int i = 0; i <2; i++) {
			for(int j = 0; j < 2 ; j++) {
				array[i][j] = i + j;
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void newClass()  {
		try {
		FileWriter fw = new FileWriter("MyFile.txt");
		fw.write("Hello world \n JAVA");
		fw.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		//FileReader fr = new FileReader("MyFile.txt"); // throws IOException or try catch loop
		//Scanner scan = new Scanner(fr);
		//while(scan.hasNextLine()) {
			//System.out.println(scan.nextLine());
		//}
		//fr.close();
	}
	
	public static void showString() {
		String a = "10";
		int b = Integer.parseInt(a);
		System.out.println(a);
	}

	public static void main (String[] args) throws Exception {
//		first();
//		starExercise();
//		numberFibonachi();
//		myMatrix();
//  	newClass();
//		showString();
		
	}
}
