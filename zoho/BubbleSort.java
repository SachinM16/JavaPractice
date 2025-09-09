package zoho;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {12,25,32,1,5,16};
		int size=arr.length;
	//	System.out.println(Arrays.toString(arr));
		for(int i =0;i<size;i++) {
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
