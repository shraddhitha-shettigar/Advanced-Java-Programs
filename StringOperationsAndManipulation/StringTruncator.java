//Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()

package program_3;
public class StringTruncator {
	public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }
        if (str.length() <= maxLength) {
            return str;
        } else {
            return str.substring(0, maxLength) + "...";
        }
    }
	public static void main(String[] args) {
		 String longString = "Hii hello namaste";
	        String shortString = "Short string";
	        int maxLength = 5;
	        System.out.println("Original: '" + longString + "'");
	        System.out.println("Truncated to " + maxLength + ": '" + truncate(longString, maxLength) + "'"); 
	        System.out.println("Original: '" + shortString + "'");
	        System.out.println("Truncated to " + maxLength + ": '" + truncate(shortString, maxLength) + "'"); 
	}
}
