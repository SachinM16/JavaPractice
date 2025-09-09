package zoho;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {9,6,1,7,5};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}

	static int[] mergeSort(int[] arr) {
		int l = 0, m = (arr.length-1)/2, r = arr.length-1;
//		System.out.print(m);
//		System.out.print(r);
		if(l<r) {
			int[] leftArray = new int[m+1];
			int[] rightArray = new int[r-m];
			
			for(int i=0;i<=m;i++) {
				leftArray[i] = arr[i];
			}//dividing array elements
			for(int i=0;i<rightArray.length;i++) {
				rightArray[i] = arr[leftArray.length+i];
			}
			
			mergeSort(leftArray);
			mergeSort(rightArray);//recrussion
			merge(arr,leftArray,rightArray);
			
		}
		return arr;
		
	}

	static void merge(int[] arr, int[] leftArray, int[] rightArray) {
		int i=0,j=0,k=0;
		while(i<leftArray.length&&j<rightArray.length) {
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			}
			else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
			
		}
		while(i<leftArray.length) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<rightArray.length) {
			arr[k] = arr[k]=rightArray[j];
			j++;
			k++;
		}
	}


}
