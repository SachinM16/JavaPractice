package zoho;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
//	    public static void main(String[] args) {
//	        String str = "aabbcdeff";
//	        char result = findFirstNonRepeating(str);
//
//	        if (result != 0) {
//	            System.out.println("First non-repeating character: " + result);
//	        } else {
//	            System.out.println("No non-repeating character found.");
//	        }
//	    }
//
//	    static char findFirstNonRepeating(String str) {
//	        // Use LinkedHashMap to maintain order of characters
//	        Map<Character, Integer> map = new LinkedHashMap<>();
//
//	        // Count frequency of each character
//	        for (char c : str.toCharArray()) {
//	            map.put(c, map.getOrDefault(c, 0) + 1);
//	        }
//
//	        // Find first character with frequency 1
//	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//	            if (entry.getValue() == 1) {
//	                return entry.getKey();
//	            }
//	        }
//	        return 0; // return 0 if no non-repeating character
//	    }
	    public static void main(String[] args) {
	        String str = "swiss";
	        System.out.println(str.lastIndexOf('i'));

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (str.indexOf(c) == str.lastIndexOf(c)) {
	                System.out.println("First non-repeating: " + c);
	                return;
	            }
	        }
	        System.out.println("No non-repeating character.");
	    }

}
