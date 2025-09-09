package zoho;

import java.util.Scanner;

public class arrrev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements:");
		for(int i = 0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		//reversing
		int b[]= new int[n];
		int j =0;
		for(int k=n-1;k>=0;k--) {
			b[j]=a[k];
			j++;
		}
		for(int l= 0;l<n;l++) {
			System.out.print(b[l]+"");
		}
	}

}
