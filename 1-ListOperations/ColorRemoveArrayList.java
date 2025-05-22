//Write a java program for getting different colors through ArrayList interface and remove the2nd element and color "Blue" from the ArrayList (using remove by index and remove by object)

package program_1;

import java.util.*;

public class ColorRemoveArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList to store different colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Blue");

        System.out.println("Original list: " + colors);

        // Removing the 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element (Red): " + colors);

        // Removing the color "Blue"
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}
