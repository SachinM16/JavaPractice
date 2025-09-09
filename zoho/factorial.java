package zoho;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int n , fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(int i=n;i>0;i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}