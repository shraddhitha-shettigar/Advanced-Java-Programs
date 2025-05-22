//Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().

package program_3;
public class NullOrWhitespaceChecker {
	public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
	public static void main(String[] args) {
        System.out.println(isNullOrEmpty("  ")); 
        System.out.println(isNullOrEmpty("Hello"));
	}
}
