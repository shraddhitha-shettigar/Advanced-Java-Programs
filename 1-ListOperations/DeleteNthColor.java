//Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index

package program_1;
import java.util.ArrayList;

public class DeleteNthColor {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Orange");
		ar.add("Red");
		ar.add("blue");
		ar.add("Voilet");

		System.out.println("Original list: " + ar);

		int n = ar.size();
		ar.remove(n - 1); // Removes the nth (last) element

		System.out.println("After removing nth element: " + ar);
	}
}
