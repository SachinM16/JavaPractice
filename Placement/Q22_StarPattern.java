package Placement;

import java.util.Scanner;

public class Q22_StarPattern {
	
	/**This program prints a right-aligned triangle star pattern using 
	 nested for loops. The number of lines (n) is provided by the user.
	 
	Problem Flow
	Get number of lines from user.
	Loop from 1 to n (line-by-line).
	For each line:
	Print n - i spaces.
	Print i stars.
	Go to the next line.

	Input / Output Example
	Input:
	How many Lines? 5
	Output:
   *
   **
  ***
 ****
*****

	 */
	public static void main(String[] args) {
		int s=5;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the no of lines:");
		//s = sc.nextInt();
		for(int i = 0; i<=s;i++) {
			
			for(int j = i;j<=s;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
	}

}
