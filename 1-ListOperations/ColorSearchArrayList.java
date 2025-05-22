//Write a java program for getting different colors through ArrayList interface and search whetherthe color "Red" is available or not ( Hint : Use ArrayListObj.contains() )


package program_1;

import java.util.*;

public class ColorSearchArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList to store different colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Blue");

        // Checking whether the color "Red" is present in the list
        boolean containsRed = colors.contains("Red");

        // Displaying the result
        if (containsRed) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}
