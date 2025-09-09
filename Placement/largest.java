package Placement;
import java.util.Scanner;
public class largest {
public void largensmall(int a[]) {
	int max =a[0];
	int min =a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("Minimun is"+min);
	System.out.println("Maximum is"+max);
}
public static void main(String[] args) {
	largest ls = new largest();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size:");
	int a = sc.nextInt();
	int arr[] = new int[a];
	System.out.println("Enter the Elements:");
	for(int i=0;i<a;i++) {
		arr[i]=sc.nextInt();
		}
	ls.largensmall(arr);
	sc.close();
	}
}
