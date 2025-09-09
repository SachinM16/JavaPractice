package zoho;

import java.util.Scanner;

public class ArrayGreaterandIndex {
	public static void main(String[] args) {
		int num[] = new int[20];
		Scanner sc = new Scanner(System.in);
		int size;
		int ind =0;
		System.out.println("Enter the number of size:");
		size=sc.nextInt();
		System.out.print("Enter the values:");
		for(int i = 0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0 ; i<size;i++) {
			if(num[ind]<num[i]) {
				ind=i;				
			}
		}
		System.out.println(num[ind]);
		System.out.println(ind);
	}

}
