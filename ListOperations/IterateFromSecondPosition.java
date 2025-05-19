//Write a Java program to iterate through all elements in a linked list starting at the specified position (2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package program_1;
import java.util.*;

public class IterateFromSecondPosition {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Apple");
		l.add("banana");
		l.add("Orange");
		l.add("Mango");
		l.add("Guava");

		Iterator<String> a = l.listIterator(1); // Starts from the 2nd position (index 1)
		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
