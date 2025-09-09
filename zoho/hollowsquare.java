package zoho;

import java.util.Scanner;

public class hollowsquare {
	public static void main(String[] args) {
		int row,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		row = sc.nextInt();
		System.out.println("Enter the no of columns:");
		col=sc.nextInt();
		for(int i = 0; i<=row;i++) {
			for(int j = 0;j<=col;j++) {
				if(i==0||i==row||j==0||j==col)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}	
	}

}