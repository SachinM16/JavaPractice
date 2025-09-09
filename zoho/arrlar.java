package zoho;

import java.util.Arrays;

public class arrlar {
	public static void main(String[] args) {
		int a[]= {12,45,8,16,23};
		for(int i= 0;i<a.length;i++) {
			for(int j = 0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp;
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
