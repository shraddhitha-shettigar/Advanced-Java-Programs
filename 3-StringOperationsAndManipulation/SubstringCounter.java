//Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

package program_3;
public class SubstringCounter {
	public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        int count = 0, index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOccurrences("hello hello Shraddha", "hello"));
    }
}
