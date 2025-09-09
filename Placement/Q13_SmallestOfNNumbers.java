package Placement;

import java.util.Scanner;

public class Q13_SmallestOfNNumbers {
	
	/**
	 * This program first reads how many numbers the user wants to enter 
	 (N). Then it reads those N numbers and finds the smallest among 
	 them.
	 
	 Problem Flow:
	Get total number of inputs N
	Read first number as smallest
	Loop remaining N-1 times
	Compare each number with smallest
	Update smallest if a smaller number is found
	Print final smallest number
	
	Sample Input / Output:
	Input:
	Enter how many numbers you want to input: 5
	Enter number 1: 22
	Enter number 2: 18
	Enter number 3: 31
	Enter number 4: 6
	Enter number 5: 27
	Output:
	The smallest number is: 6

	 */
	public static void main(String[] args) {
		int n,m,smallest;
		m=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many no you want to input:");
		n = sc.nextInt();
		
		if(n<0) {
			System.out.println("Enter a valid no;");
			return;
		}
		
		System.out.println("Enter the 1 number;");
		smallest = sc.nextInt();
		
		for(int i=2;i <=n ;i ++) {
			System.out.println("Enter the "+i+"number:");
			m = sc.nextInt();
		
		if(m < smallest) {
			smallest = m;
		}
		}
		System.out.println("The smallest number is:"+smallest);
	}

}
