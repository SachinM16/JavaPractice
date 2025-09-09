package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ,m;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr1[] = new int[n];
		for(int i = 0;i<n;i++) 
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the size:");
		m=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr2[] = new int[m];
		for(int i = 0;i<m;i++) 
		{
			arr2[i]=sc.nextInt();
		}
		//getting the array elements
		int arr3[] = new int[m+n];
		int j =0;
		for(int i =0;i<arr1.length;i++) 
		{
			arr3[j]=arr1[i];
			j++;
		}
		for(int i =0;i<arr2.length;i++) 
		{
			arr3[j]=arr2[i];
			j++;
		}
		//storing in the third array
		for(int i =0;i<arr3.length-1;i++)
		{
			for(int k = 0;k<arr3.length-1-i;k++) 
			{
				if(arr3[k]>arr3[k+1]) {
					int temp = arr3[k];
					arr3[k]=arr3[k+1];
					arr3[k+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

}
