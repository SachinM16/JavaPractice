package zoho;

public class DutchFlag {
	    public static void main(String[] args) {
	        int arr[] = {2, 0, 2, 1, 1, 0};

	        int low = 0;              // pointer for 0
	        int mid = 0;              // pointer for current element
	        int high = arr.length - 1; // pointer for 2

	        // Process the array until mid crosses high
	        while (mid <= high) {
	            if (arr[mid] == 0) {
	                // Swap arr[low] and arr[mid]
	                int temp = arr[low];
	                arr[low] = arr[mid];
	                arr[mid] = temp;

	                low++;
	                mid++;
	            } 
	            else if (arr[mid] == 1) {
	                // Just move mid forward
	                mid++;
	            } 
	            else { // arr[mid] == 2
	                // Swap arr[mid] and arr[high]
	                int temp = arr[mid];
	                arr[mid] = arr[high];
	                arr[high] = temp;

	                high--; // Only move high backward
	            }
	        }

	        // Print the sorted array
	        System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
