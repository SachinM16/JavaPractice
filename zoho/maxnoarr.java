package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class maxnoarr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array element:");
		for(int i = 0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {//change the symbol of greater 
					//to get the minimum and maximum values and print
					//it using the index
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

}
