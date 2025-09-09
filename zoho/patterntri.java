package zoho;

import java.util.Scanner;

public class patterntri {
	public static void main(String[] args) {
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines:");
		s = sc.nextInt();
		for(int i = 1; i<=s;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}	
	}

}
