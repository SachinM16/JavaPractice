package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class InsertMiddle 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i =0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		System.out.println("Enter the number to insert:");
		int num = sc.nextInt();
		for(int i =size-1;i>=pos-1;i--) 
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=num;
		size++;
		System.out.println(Arrays.toString(arr));
		System.out.println("Array after insertion:");
		for(int i=0;i<size;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
