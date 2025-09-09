package zoho;

public class PermuteString {
	    // Function to generate permutations
	    static void permute(String str, String ans) {
	        // Base case: if string becomes empty, print the answer
	        if (str.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        // Loop through the string
	        for (int i = 0; i < str.length(); i++) {
	            // Pick the character at index i
	            char ch = str.charAt(i);

	            // Remaining string after removing ch
	            String ros = str.substring(0, i) + str.substring(i + 1);

	            // Recursive call with smaller string and updated answer
	            permute(ros, ans + ch);
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        String input = "ABC";   // You can change this string
	        System.out.println("All permutations of " + input + " are:");
	        permute(input, "");     // Call the function
	    }
	}

