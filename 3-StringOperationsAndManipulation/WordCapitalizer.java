//Write a Java Program for Capitalizing the first letter of each word using user defined function capitalizeWords()

package program_3;
public class WordCapitalizer {
	 public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) 
	        	return str;
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
	            }
	        }
	        return result.toString().trim();
	    }
	public static void main(String[] args) {
		 System.out.println(capitalizeWords("hello world"));
	}
}
