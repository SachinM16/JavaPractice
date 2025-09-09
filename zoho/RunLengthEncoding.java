package zoho;

public class RunLengthEncoding {
	    public static void main(String[] args) {
	        String input = "aaabbcddd";
	        String encoded = encode(input);

	        System.out.println("Original: " + input);
	        System.out.println("Encoded : " + encoded);
	    }

	    // Function for Run Length Encoding
	    static String encode(String str) {
	        StringBuilder result = new StringBuilder();

	        int count = 1; // count for repeating characters
	        for (int i = 0; i < str.length(); i++) {
	            // If next character is same, increase count
	            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	            } else {
	                // Append character + count
	                result.append(str.charAt(i)).append(count);
	                count = 1; // reset count
	            }
	        }
	        return result.toString();
	    }
}
