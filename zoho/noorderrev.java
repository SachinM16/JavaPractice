package zoho;

import java.util.Scanner;

public class noorderrev {
	public static void main(String[] args) {
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines:");
		s = sc.nextInt();
		for(int i = 1; i<=s;i++) {
			for(int j = i;j<=s;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}	
	}

}