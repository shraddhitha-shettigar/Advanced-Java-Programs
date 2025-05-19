//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))

package program_1;
import java.util.Collections;
import java.util.LinkedList;

public class SwapElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("banana");
        l.add("Orange");
        l.add("Mango");
        l.add("Guava");
        Collections.swap(l, 0, 2);
        System.out.println(l);
    }
}
