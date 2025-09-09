package zoho;

import java.util.Arrays;

public class firstlargestno {
	public static void main(String[] args) {
		int temp =0;
		int[] a = {4,65,78,32,12};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
