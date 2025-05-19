//Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()

package program_1;
import java.util.*;

public class ExtractColorsSubList {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Orange");
		ar.add("Red");
		ar.add("blue");
		ar.add("Voilet");

		List<String> sub = ar.subList(0, 2);
		System.out.println(sub);
	}
}
