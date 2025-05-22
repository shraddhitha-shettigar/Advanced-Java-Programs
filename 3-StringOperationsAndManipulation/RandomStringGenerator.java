//Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()

package program_3;
import java.util.*;
public class RandomStringGenerator {
	public static String generateRandomString(int length) {
        if (length <= 0) 
        	return "";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(generateRandomString(8));
	}
}
