package zoho;

import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		int s=0,t=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		s = sc.nextInt();
		System.out.println("Enter the no of columns:");
		t=sc.nextInt();
		for(int i = 1; i<=s;i++) {
			for(int j = 1;j<=t;j++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}	
	}

}
