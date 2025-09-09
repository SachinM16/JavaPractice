package zoho;

import java.util.Arrays;

public class Frequency {
	
		public static void main(String[] args) {
	        int a[] = {11, 25, 3, 3, 6, 23, 11, 4, 23, 3, 5, 7, 7, 3, 2, 25, 25};

	        Arrays.sort(a); // Step 1: sort array
	        System.out.println("Sorted: " + Arrays.toString(a));

	        // Step 2: Count frequencies
	        int n = a.length;
	        int[] elements = new int[n]; // store unique elements
	        int[] freq = new int[n];     // store frequency
	        int size = 0;                // count of unique elements

	        for (int i = 0; i < n; i++) {
	            int count = 1;
	            while (i < n - 1 && a[i] == a[i + 1]) {
	                count++;
	                i++;
	            }
	            elements[size] = a[i];
	            freq[size] = count;
	            size++;
	        }

	        // Step 3: Sort elements by frequency (descending)
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (freq[i] < freq[j]) {
	                    // swap frequencies
	                    int temp = freq[i];
	                    freq[i] = freq[j];
	                    freq[j] = temp;
	                    // swap elements also
	                    int t = elements[i];
	                    elements[i] = elements[j];
	                    elements[j] = t;
	                }
	            }
	        }

	        // Step 4: Build final array
	        int[] result = new int[n];
	        int index = 0;
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < freq[i]; j++) {
	                result[index++] = elements[i];
	            }
	        }

	        System.out.println("Final Array by frequency: " + Arrays.toString(result));
	    }
	

}
