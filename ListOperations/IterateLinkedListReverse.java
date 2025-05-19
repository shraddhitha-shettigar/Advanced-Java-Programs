//Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())

package program_1;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("banana");
        l.add("Orange");
        l.add("Mango");
        l.add("Guava");

        Iterator<String> a = l.descendingIterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }
    }
}
