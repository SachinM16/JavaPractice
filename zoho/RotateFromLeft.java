package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class RotateFromLeft {
	public static void main(String[] args) {
		int rot;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		rot=sc.nextInt();
		int arr[] = {12,14,16,20,25};
		int b[] = new int[5];
		int j =0;
		for(int i = rot; i<arr.length;i++) {
			b[j]=arr[i];
			j++;			
		}
		for(int i =0;i<rot;i++) {
			b[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}

}
