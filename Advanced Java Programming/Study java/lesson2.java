import java.util.ArrayList;
import java.util.Arrays;

public class lesson2 {
	
	public static int addAll (int ...num) {
		int summ = 0;
		for (int i =0; i < num.length; i++) {
			summ += num[i];
		}
		System.out.println(summ);
		return summ;

	}
	
	public static void newArray () {
		ArrayList<String> newArray = new ArrayList<>();
		
		newArray.add("name"); // end array
		newArray.add(0, "first name");  // start array
		
		System.out.println(newArray.size()); // length
		
		System.out.println(newArray.get(1)); // show index array
		
		System.out.println(newArray.indexOf("name"));  // index element
		
		newArray.set(1, "last name");   //  replace element
		System.out.println(newArray.get(1));
//		newArray.remove(0);        delete element
	//	newArray.remove("last name");
//		newArray.clear();   delete all array
		
	}
	
	public static void sortArrayBuble () {
		int[] array = { 34, 2, 5, 12};
		
		boolean status = false;
		int buffer;
		
		while(!status) {
			status = true;
			for(int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {
					status = false;
					
					buffer = array[i];
					array[i] = array[i+1];
					array[i+1] = buffer;
				}
			}
		}
		for(int i:array) {
			System.out.print(i + " ");
		}
//		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
//		addAll(12, 142, 34);
		
//		lesson2 myAdd = new lesson2();
//		System.out.print(myAdd.addAll(12, 3));
		
//		newArray();
//		sortArrayBuble();
	}

}
