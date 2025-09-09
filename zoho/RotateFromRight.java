package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class RotateFromRight {
	public static void main(String[] args) {
		int arr[]={12,32,42,52,62};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rotation number:");
		int rot=sc.nextInt();	
		int b[] = new int[arr.length];
		int j =0;
		for(int i =arr.length-rot;i<=arr.length-1;i++) {
			b[j]=arr[i];
			j++;
		}
		for(int i = 0;i<arr.length-rot;i++) {
			b[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}

}
