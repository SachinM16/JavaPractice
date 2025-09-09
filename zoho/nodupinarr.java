package zoho;

import java.util.Scanner;

public class nodupinarr {
	public static void main(String[] args) {
		int n,a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n =sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the "+n+" elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<arr.length-1;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]==arr[k]) {
					a++;
				}
			}
		}
		System.out.println(a);
	}

}
