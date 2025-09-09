package zoho;

import java.util.Scanner;

public class nopalin {
	public static void main(String[] args) {
		int n , rev =0, n1 = 0,dig=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		n1=n;
		while(n1!=0) {
			dig=n1%10;
			rev=rev*10+dig;
			n1=n1/10;
		}
		System.out.println(rev);
	}
}
