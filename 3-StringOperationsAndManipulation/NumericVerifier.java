//Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()

package program_3;
public class NumericVerifier {
	 public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }
	        return str.matches("\\d+"); 
	    }

	public static void main(String[] args) {
		System.out.println(isNumeric("123"));    // true
		System.out.println(isNumeric("123.ab")); // false
	}
}
