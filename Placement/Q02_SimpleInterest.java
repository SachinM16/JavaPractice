package Placement;

import java.util.Scanner;

public class Q02_SimpleInterest {
	
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */
	public static void main(String[] args) {
		double p, n, r;
		double si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal amount:");
		p = sc.nextDouble();
		System.out.println("Enter the Number of years:");
		n = sc.nextDouble();
		System.out.println("Enter the Rate of interest:");
		r = sc.nextDouble();
		si = (p*n*r)/100;
		System.out.println("Simple Interest of the given values are:"+si);
	}

}
