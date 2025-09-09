package zoho;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int q = 0,a=0,b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		q=sc.nextInt();
		for(int i = 0 ; i <=q ; i++) {
			System.out.print(a+" ");
			int c = b+a;
			a=b;
			b=c;
		}
	}

}
