import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lesson4 {
	
	public static void main(String[] args) {
	    List<User> users = Arrays.asList(
	            new User("John", 28),
	            new User("Jane", 35),
	            new User("Alex", 21));

	    System.out.println("Before sort:");
	    for (User user : users) {
	        System.out.println(user);
	    }

	    Collections.sort(users, new Comparator<User>() {
	        @Override
	        public int compare(User o1, User o2) {
	            return o1.getAge() - o2.getAge();
	        }
	    });

	    System.out.println("\nAfter sort:");
	    for (User user : users) {
	        System.out.println(user);
	    }
	}
}
