//Write a java program for getting different colors through ArrayList interface and sort themusing Collections.sort( ArrayListObj)


package program_1;

import java.util.*;

public class ColorSortArrayList {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Orange");
        ar.add("Red");
        ar.add("blue");
        ar.add("Voilet");

        // Sorting the ArrayList using Collections.sort()
        Collections.sort(ar);

        // Printing the sorted list
        System.out.println("Sorted colors: " + ar);
    }
}
