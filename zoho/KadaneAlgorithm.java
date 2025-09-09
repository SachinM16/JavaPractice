package zoho;

public class KadaneAlgorithm {
	    public static void main(String[] args) {
	        // Example array
	        int arr[] = {2, -3, 4, -1, 2, 1, -5, 4};

	        // Start by assuming the first element is both current sum and max sum
	        int currentSum = arr[0];
	        int maxSum = arr[0];

	        // Loop through the array starting from index 1
	        for (int i = 1; i < arr.length; i++) {
	            // Decide: either take the current element alone OR extend the current subarray
	            currentSum = Math.max(arr[i], currentSum + arr[i]);

	            // Update maxSum if currentSum is greater
	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	            }
	        }
	        System.out.println("Maximum Subarray Sum = " + maxSum);
	    }
	}

