package Placement;

import java.util.Scanner;

public class Q25_SecondLargestFinder {
	
	/**
	 * This program reads n integers into an array and finds the second
	 largest number among them. It uses a class with methods for input, 
	 processing (finding second largest), and output. It showcases 
	 array handling and object-oriented principles in Java.
	 
	Problem Flow 
	Read input size n
	Store values in array
	Use loop to compare and find:
		largest
		secondLargest
	Display result
	
	Input / Output Example
Input:
Enter how many numbers: 6
Enter the numbers:
10
45
22
45
8
19

Output:
Second largest number is: 22


	 */
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers:");
		n = sc.nextInt();
		int[] ary = new int[n];
		System.out.println("Enter the elements:");
		for(int i = 0; i < n; i++) {
			ary[i] = sc.nextInt();
		}
		for(int j =0 ; j < n ; j++) {
			
			for(int i = 0; i< n-1; i++) {
				if(ary[i]<ary[i+1]) {
					int temp =ary[i];
					 ary[i]= ary[i+1];
					 ary[i+1]=temp;
				}
			}
		}
		System.out.println("Second largest no is:"+ary[1]);
	}

}
