package zoho;

import java.util.Scanner;

public class countofno {
	public static void main(String[] args) {
		int  n =0,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		
	}

}
