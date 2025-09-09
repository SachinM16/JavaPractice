package zoho;

public class MatrixMul {
	public static void main(String[] args) {
		int arr[][] = {{4,5,6},{3,9,1},{7,8,2}};
		int arr2[][] = {{2,5,2},{3,7,9},{1,9,1}};
		int arr3[][] = new int[3][3];
		int ans[][] = new int[3][3];
		for(int i =0 ;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++)			
			{
				for (int k = 0; k < ans.length; k++) {
					arr3  [i][j] += arr[i][k]*arr2[k][j];
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
