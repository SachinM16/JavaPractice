package Placement;

import java.util.Scanner;

public class Q20_FibonacciSeries {
	/**
	 * This program calculates and displays the first n numbers in the 
	 Fibonacci sequence. Each number is the sum of the previous 
	 two numbers.
	 
	 Code Flow 
	Input: number of terms n
	Initialize first two terms: f1 = 1, f2 = 1
	Loop from i = 3 to n:
		Find next term using f = f1 + f2
		Shift values for next round
	Display all terms
	
	Sample Input/Output
 	Input:
	How many Fibonacci terms? 10
	Output:
	1 1 2 3 5 8 13 21 34 55

	 */
	public static void main(String[] args) {
		int n, i =0,f1=1,f2=1,f=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci terms:");
		n = sc.nextInt();
		if (n >= 1)
            System.out.println(f1 + " ");
        if (n >= 2)
            System.out.println(f2 + " ");
		for(i=3;i<=n;i++) {
			f= f1 + f2;
			System.out.println(f+" ");
			f1 = f2;
			f2 = f;
			
		}
		
	}
}
