package Placement;

import java.util.Scanner;

public class Q06_StudentMarks {
	
	/**
	 * This program allows the user to enter 3 test marks of a student, 
	 calculates the total and average, and displays the result.
	 
	Problem Flow:
	Get 3 marks from user
	Add marks → total
	Divide total by 3.0 → average
	Display total and average
	
	Input / Output Example:
	Input:
	Enter Mark 1: 80  
	Enter Mark 2: 75  
	Enter Mark 3: 85  
	Output:
	Total Marks   = 240  
	Average Marks = 80.0
	 */
	public static void main(String[] args) {
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first mark:");
		m1 = sc.nextInt();
		System.out.println("Enter the second mark:");
		m2 = sc.nextInt();
		System.out.println("Enter the third mark:");
		m3 = sc.nextInt();
		int total;
		total = m1 + m2 + m3;
		System.out.println("Total mark:"+total);
		double avg;
		avg = total / 3.0;
		System.out.println("Average:"+avg);
	}
}
