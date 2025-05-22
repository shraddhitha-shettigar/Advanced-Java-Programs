//Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()

package program_3;
public class WhitespaceRemover {
	public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // Replace all whitespace characters (spaces, tabs, newlines, etc.)
        return str.replaceAll("\\s+", "");
    }
	public static void main(String[] args) {
		  System.out.println(removeWhitespace(" Hello World ")); 
	}
}
