package Placement;

import java.util.Scanner;

public class Q08_SumOfOddIntegers {
	
	/**
	 * This program calculates the sum of the first n odd integers 
	 (Example: 1 + 3 + 5 + ... + (2n - 1)).
	 
	 Problem Flow:
	Input n from user
	Loop from 1 to (2n−1) in steps of 2
	Accumulate the sum
	Print the result
	
	Input / Output Example:
	Input:
	Enter how many odd numbers to sum: 5
	Output:
	Sum of first 5 odd numbers is 25
	(1 + 3 + 5 + 7 + 9 = 25)

	 */
	public static void main(String[] args) {
		int n, i, sum, odd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many odd numbers:");
		n = sc.nextInt();
		odd = 1;
		sum = 0;
		for(i=0;i<n;i++) {
			sum = sum + odd;
			odd +=2;
		}
		System.out.println("Sum of first"+n+"odd numbers:"+sum);
		
	}
		

}
