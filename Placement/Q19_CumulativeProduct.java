package Placement;

import java.util.Scanner;

public class Q19_CumulativeProduct {
	
	/**
	 * This program reads a set of numbers from the user and calculates 
	 the cumulative product, which means multiplying all the numbers 
	 together one by one.
	 
	 Code Flow 
	Get number count n
	Use for loop to input numbers
	Multiply each number with product
	Print final result
	
	Test Data
	Input:
	6.2, 12.3, 5.0, 18.8, 7.1, 12.8
	Output:
	Cumulative Total = 514537.165312


	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        double product = 1.0;

        for (int i = 1; i <= n; i++) {
        	System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            product *= num;
        }

        System.out.println("Cumulative product = " + product);
    }
}
