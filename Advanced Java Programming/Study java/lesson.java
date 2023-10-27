import java.util.Scanner;

class lesson {
    public static void dataType() {
        byte myByte= 2;
        short myShort = 1234;
        int k;
        k = 10;
        long myLong = 1234123433;


        String letter = "letter";
        boolean myResult = false;

        char lesson = 'L';
        float pi = 3.14f;
        double myDouble = 2342.3;
        
        final double Pi = 3.141592;

        System.out.println(myShort);
    }

    public static int utilScanner( ) {
        Scanner mySc = new Scanner(System.in);
        System.out.print("Type number: ");
        int newNumber = mySc.nextInt();
        System.out.println("new number is " + newNumber);
        // String newLing = mySc.nextLine();  
        // double newDouble = mySc.nextDouble();  always 3.4 DOT !!!
        return newNumber;

    }
    
    public static void cycleWhile () {
    	
    	
    	int result = 0;
    	int index = 1;
    	
		while(result < 100) {
    		result = 7 * index;
    		index++;
    		System.out.println(result);
    	}
    }
    
    public static void cycleWhile2() {
    	int result = 1;
    	while (result < 260) {
    		System.out.println(result);
    		result += result;
    	}
    }
    
    public static void myRandom() {
    	double myRandom = Math.random();
    	System.out.println(myRandom);
    	// ( Math.random() * (b-a) ) + a
    	
    	int number = (int) (Math.random() *100);
    	System.out.println(number);
    	
    	float num = 5.5f;
    	int num1 = Math.round(num);
    	double num2 = Math.floor(num);
    	double num3 = Math.ceil(num);
    	
    	System.out.println(num1);
    	System.out.println(num2);
    	System.out.println(num3);
    	
    	float numMin = 3.34f;
    	int numMax = 34;
    	double num4 = Math.min(numMax, numMin);
    	double num5 = Math.max(numMax, numMin);
    	System.out.println(num4);
    	System.out.println(num5);
    }
    
    public static void myString () {
    	String myString = "Hello world";
    	String myStr = "Hello world"; 
    	int myNum = 10;
    	
    	System.out.println(myString.length());
    	System.out.println(myString.concat("!!!"));
    	System.out.println(myString.substring(6));
    	System.out.println(myString.trim());
    	System.out.println(myString.toUpperCase());
    	System.out.println(myString.toLowerCase());
    	
    	boolean result = myString.endsWith("world");
    	System.out.println(result);
    	
    	char ch1 = myString.charAt(0);
    	char ch2 = myString.charAt(1);
    	System.out.println(ch1);    
    	System.out.println(ch2);
    	
    	boolean result2 = myString.equals(myStr);
    	System.out.println(result2);
    	System.out.println(myString.equals(myNum));
    	System.out.println(myString.compareTo(myStr));
    	
    	
    	
    }
    
    public static void main(String[] args) {
        // dataType();
//        utilScanner();
//    	cycleWhile2();
//    	myRandom();
    	myString();
    }
}