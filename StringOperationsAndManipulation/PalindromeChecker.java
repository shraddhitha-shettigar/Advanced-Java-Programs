//Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome().

package program_3;
public class PalindromeChecker {
	public static String reverse(String str) {
        if (str == null) 
        	return null;
        return new StringBuilder(str).reverse().toString();
    }	
	public static void isPalindrome(String str) {
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String rev = reverse(str);
		String revClean = rev.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		if(cleanedStr.equalsIgnoreCase(revClean)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
    }

	public static void main(String[] args) {
		isPalindrome("Mom^");
		isPalindrome("Hello"); 
	}
}
