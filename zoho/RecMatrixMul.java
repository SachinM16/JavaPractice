package zoho;

public class RecMatrixMul {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int arr1[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int ans[][] = new int[arr.length][arr1[0].length];
		
		if(arr[0].length==arr1.length) {
			for(int i =0 ;i<arr.length;i++) {
				for(int j =0;j<arr1[0].length;j++)			
				{
					for (int k = 0; k <arr1.length ; k++) {
						ans[i][j] += arr[i][k]*arr1[k][j];
					}
				}
			}
		}
		for(int i =0;i<ans.length;i++) {
			for(int j =0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
