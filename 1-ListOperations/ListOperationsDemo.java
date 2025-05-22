//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package program_1;
import java.util.*;

public class ListOperationsDemo {

    public static void main(String[] args) {
        // === ArrayList Operations ===
        System.out.println("=== ArrayList Operations ===");
        ArrayList<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + arrayList);

        // 3. Adding multiple elements
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pineapple");
        arrayList.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(3, "Strawberry");
        System.out.println("After updating element at index 3: " + arrayList);

        // 6. Removing elements
        arrayList.remove("Banana");
        System.out.println("After removing 'Banana': " + arrayList);
        arrayList.remove(2);
        System.out.println("After removing element at index 2: " + arrayList);

        // 7. Searching elements
        System.out.println("Is 'Apple' in the list? " + arrayList.contains("Apple"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());

        // 9. Iterating using for-each loop
        System.out.print("Iterating using for-each: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Iterating using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> itr1 = arrayList.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        // 12. Sublist
        List<String> subList1 = arrayList.subList(1, 3);
        System.out.println("Sublist (index 1 to 2): " + subList1);

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("After clearing the ArrayList: " + arrayList);

        System.out.println("\n=== LinkedList Operations ===");
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("After adding elements: " + linkedList);

        // 2. Adding element at specific index
        linkedList.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + linkedList);

        // 3. Adding multiple elements
        LinkedList<String> moreFruits2 = new LinkedList<>();
        moreFruits2.add("Grapes");
        moreFruits2.add("Pineapple");
        linkedList.addAll(moreFruits2);
        System.out.println("After adding multiple elements: " + linkedList);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        linkedList.set(3, "Strawberry");
        System.out.println("After updating element at index 3: " + linkedList);

        // 6. Removing elements
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList);
        linkedList.remove(2);
        System.out.println("After removing element at index 2: " + linkedList);

        // 7. Searching elements
        System.out.println("Is 'Apple' in the list? " + linkedList.contains("Apple"));

        // 8. List size
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating using for-each loop
        System.out.print("Iterating using for-each: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Iterating using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> itr2 = linkedList.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(linkedList);
        System.out.println("After sorting: " + linkedList);

        // 12. Sublist
        List<String> subList2 = linkedList.subList(1, 3);
        System.out.println("Sublist (index 1 to 2): " + subList2);

        // 13. Clearing the list
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);
    }
}
