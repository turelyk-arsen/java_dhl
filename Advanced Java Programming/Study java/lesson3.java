import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class lesson3 {
	
	public static void myHashMap() {
		// key --  value  == MAP
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		myHashMap.put("my", "string");
		myHashMap.put("new", "value");
		
		for (Map.Entry<String, String> entry: myHashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println(myHashMap.get("my"));
		
//		myHashMap.remove("my");
		System.out.println(myHashMap.size());
		
		System.out.println(myHashMap.containsValue("my"));
		System.out.println(myHashMap.containsValue("string"));
		
		System.out.println(myHashMap.containsKey("my"));
		System.out.println(myHashMap.containsKey("string"));
	}
	
	public static void myHashSet() {
		// unique element in SET
		HashSet<Integer> myHashSet = new HashSet<Integer>();
		
		myHashSet.add(1);
		myHashSet.add(2);
		myHashSet.add(3);
		
		for(int i:myHashSet) {
			System.out.println(i);
		}
		
		myHashSet.remove(2);
		
		System.out.println(myHashSet.contains(2));
		System.out.println(myHashSet.size());
		myHashSet.clear();
		System.out.println(myHashSet.isEmpty());
	}
	
	public static void myQueue () {
		PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
		
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		
		for (int q: myQueue) {
			System.out.println(q);
		}
		
		myQueue.remove(4);
		myQueue.poll();
		myQueue.remove();
		
		// add new element at the end of the queue
		myQueue.offer(1234);
		for (int q: myQueue) {
			System.out.println(q);
		}
		
		//show first element 
		System.out.println(myQueue.peek());
		System.out.println(myQueue.element());
		
	}

	public static void main (String[] args) {
//		myHashMap();
//		myHashSet();
//		myQueue();
	}
}
