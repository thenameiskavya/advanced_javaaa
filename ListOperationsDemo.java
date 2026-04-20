package lab1;
import java.util.*;

public class ListOperationsDemo {
	


	    public static void main(String[] args) {

	        // Create ArrayList and LinkedList
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        System.out.println("Initial ArrayList: " + arrayList);
	        System.out.println("Initial LinkedList: " + linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        System.out.println("\nAfter adding at index 1:");
	        System.out.println(arrayList);
	        System.out.println(linkedList);

	        // 3. Adding multiple elements
	        List<String> extra = Arrays.asList("Grapes", "Pineapple");
	        arrayList.addAll(extra);
	        linkedList.addAll(extra);

	        System.out.println("\nAfter adding multiple elements:");
	        System.out.println(arrayList);
	        System.out.println(linkedList);

	        // 4. Accessing elements
	        System.out.println("\nAccess element at index 2:");
	        System.out.println("ArrayList: " + arrayList.get(2));
	        System.out.println("LinkedList: " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(0, "Green Apple");
	        linkedList.set(0, "Green Apple");

	        System.out.println("\nAfter updating first element:");
	        System.out.println(arrayList);
	        System.out.println(linkedList);

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");

	        System.out.println("\nAfter removing Banana:");
	        System.out.println(arrayList);
	        System.out.println(linkedList);

	        // 7. Searching elements
	        System.out.println("\nSearch for Orange:");
	        System.out.println("ArrayList contains Orange? " + arrayList.contains("Orange"));
	        System.out.println("LinkedList contains Orange? " + linkedList.contains("Orange"));

	        // 8. List size
	        System.out.println("\nSize of lists:");
	        System.out.println("ArrayList size: " + arrayList.size());
	        System.out.println("LinkedList size: " + linkedList.size());

	        // 9. Iterating over list (for-each)
	        System.out.println("\nIterating using for-each:");
	        for (String item : arrayList) {
	            System.out.print(item + " ");
	        }

	        // 10. Using Iterator
	        System.out.println("\n\nUsing Iterator:");
	        Iterator<String> it = linkedList.iterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);

	        System.out.println("\n\nAfter sorting:");
	        System.out.println(arrayList);
	        System.out.println(linkedList);

	        // 12. Sublist
	        System.out.println("\nSublist (index 1 to 3):");
	        System.out.println("ArrayList: " + arrayList.subList(1, 3));
	        System.out.println("LinkedList: " + linkedList.subList(1, 3));

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();

	        System.out.println("\nAfter clearing lists:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);
	    }
	}

