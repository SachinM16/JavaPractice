package Placement;

import java.util.Scanner;

public class Q12_Histogram {
	
	/**
	 * This program reads 5 numbers (each between 1 and 30) from the user.
	 For each number, it prints a line with that many asterisks *, 
	 forming a simple bar chart or histogram.
	 
	 Problem Flow:
	Read 5 numbers from the user
	Loop through each number
	For each number:
	Print the number
	Print that many * using inner loop
	
	Sample Output:
	Input:
	Enter 5 Numbers in a same line: 
	3 7 2 6 1
	Output:
	3 ***
 	7 *******
 	2 **
 	6 ******
 	1 *
 	
	 */
	public static void main(String[] args) {
		int []n = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers in same line:");
		
		for(int i = 0; i<5; i++) {
			n[i] = sc.nextInt();
		}
		for(int i =0 ; i<5;i++) {
			int num = n[i];
			System.out.print(num+"");
		for(int j =0;j<num;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
