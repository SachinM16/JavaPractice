package zoho;

public class secondlargestno {
	public static void main(String[] args) {
		int temp =0;
		int[] a = {4,65,78,32,12};
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]<a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
