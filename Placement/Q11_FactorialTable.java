package Placement;

import java.util.Scanner;

public class Q11_FactorialTable {
	
	/**
	 * This program reads a number n from the user and prints the 
	 factorial of numbers from 1 to n in a table format.
	 
	 Problem Flow:
	Read n from user
	Start fact = 1
	Loop from 1 to n
	Multiply fact *= i
	Print each number with its factorial
	
	Sample Output:
	Input:
	Enter the N value: 5

	Output:
	N   |   Factorial
	--------------------
  	1  |            1
  	2  |            2
  	3  |            6
  	4  |           24
  	5  |          120
	 */
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");
		n = sc.nextInt();
		System.out.println("\nN    |   Factorial");
		System.out.println("--------------------");
		int fact, i;
		fact =1;
		for(i=1;i<=n;i++) {
			
			fact *=  i;
			System.out.printf("%-3d |   %d%n", i, fact);
		}
		
	}
}
