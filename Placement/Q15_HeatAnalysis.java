package Placement;

import java.util.Scanner;

public class Q15_HeatAnalysis {
	
	/**
	 *  This program uses a switch statement to examine the value of 
	 an integer called flag. Based on its value, it prints one of the
	 following messages:
		HOT if the flag has the value 1.
		LUKE WARM if the flag has the value 2.
		COLD if the flag has the value 3.
		OUT OF RANGE if the flag has any other value.
		
	 Problem Flow:
	Prompt the user to input an integer value for the flag.
	Use a switch statement to check the value of the flag and assign the correct heat status.
	Print the flag value and its corresponding heat status.
	
	Sample Input / Output:
	Input:
	Enter Heat code (1-3): 2

	Output:
	Flag 2 is LUKE WARM


	 */
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Heat Code(1-3):");
		n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Hot");
			break;
			
		case 2:
			System.out.println("Luke Warm");
			break;
		case 3:
			System.out.println("COLD");
			break;
			
		case 4:
			System.out.println("Out of Range");
			break;
		
		}
	}

}
