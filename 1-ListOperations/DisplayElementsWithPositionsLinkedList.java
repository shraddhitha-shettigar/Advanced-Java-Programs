//Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )

package program_1;
import java.util.LinkedList;

public class DisplayElementsWithPositionsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("banana");
        l.add("Orange");
        l.add("Mango");
        l.add("Guava");
        for(int i = 0; i < l.size(); i++) {
            System.out.println(i + " " + l.get(i));
        }
    }
}
