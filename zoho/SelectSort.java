package zoho;

public class SelectSort 
{
	public static void sort(int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n;i++) 
		{
			int min=i;
			for(int j=i+1;j<n;j++) 
			{
				if(arr[j]<arr[min]) 
				{
					min=j;					
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int num:arr) 
		{
			System.out.print(num+" ");			
		}
	}
	public static void main(String[] args) 
	{
		int []ar = {21,5,23,1,60};
		sort(ar);
	}

}
