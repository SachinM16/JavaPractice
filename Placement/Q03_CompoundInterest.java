package Placement;

import java.util.Scanner;

public class Q03_CompoundInterest {
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */
	public static void main(String[] args) {
		double p, r, n, i, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		p = sc.nextDouble();
		System.out.println("Enter the rate of Interest:");
		r = sc.nextDouble();
		System.out.println("Enter the no. of years:");
		n = sc.nextDouble();
		i = r/100;
		f = p*Math.pow((1+i),n);
		System.out.println("Compound Interest is:"+f);
		
		
		
	}

}
