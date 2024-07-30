package hackathon;
import java.util.*;
public class question_20 {

	public static void main(String[] args) {
		/*WJP to find total number of repeated integers, 
		 * uppercase and lowercase character in the give string
		 */

		        String input = "Hello123 World! 456 Hello";

		        Map<Character, Integer> charCountMap = new HashMap<>();

		        // Count occurrences of each character
		        for (char c : input.toCharArray()) {
		            if (Character.isLetterOrDigit(c)) {
		                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		            }
		        }

		        int repeatedIntegers = 0;
		        int repeatedUppercase = 0;
		        int repeatedLowercase = 0;

		        Map<Character, Integer> repeatedIntegersMap = new HashMap<>();
		        Map<Character, Integer> repeatedUppercaseMap = new HashMap<>();
		        Map<Character, Integer> repeatedLowercaseMap = new HashMap<>();

		        // Find repeated integers, uppercase and lowercase characters
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            char c = entry.getKey();
		            int count = entry.getValue();

		            if (count > 1) {
		                if (Character.isDigit(c)) {
		                    repeatedIntegers++;
		                    repeatedIntegersMap.put(c, count);
		                } else if (Character.isUpperCase(c)) {
		                    repeatedUppercase++;
		                    repeatedUppercaseMap.put(c, count);
		                } else if (Character.isLowerCase(c)) {
		                    repeatedLowercase++;
		                    repeatedLowercaseMap.put(c, count);
		                }
		            }
		        }

		        // Print results
		        System.out.println("Repeated integers:");
		        for (Map.Entry<Character, Integer> entry : repeatedIntegersMap.entrySet()) {
		            System.out.println("Number '" + entry.getKey() + "' is repeated " + entry.getValue() + " times");
		        }

		        System.out.println("\nRepeated uppercase characters:");
		        for (Map.Entry<Character, Integer> entry : repeatedUppercaseMap.entrySet()) {
		            System.out.println("Uppercase '" + entry.getKey() + "' is repeated " + entry.getValue() + " times");
		        }

		        System.out.println("\nRepeated lowercase characters:");
		        for (Map.Entry<Character, Integer> entry : repeatedLowercaseMap.entrySet()) {
		            System.out.println("Lowercase '" + entry.getKey() + "' is repeated " + entry.getValue() + " times");
		        }
		    }	

	}


