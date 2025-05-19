//Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))

package program_1;
import java.util.LinkedList;

public class InsertElementAtEndLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("banana");
        l.add("Orange");
        l.add("Mango");
        l.add("Guava");
        l.offerLast("Pink");
        System.out.println(l);
    }
}
