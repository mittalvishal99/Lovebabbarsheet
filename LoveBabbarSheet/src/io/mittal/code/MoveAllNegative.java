package io.mittal.code;
public class MoveAllNegative 
{
	public static void main(String[] args) 
	{
		int arr[] = { -5, 7, -3, -4, 9, 10, -1, 11 };
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) 
		{
			if (arr[low] < 0 && arr[high] > 0) 
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			} else if (arr[low] < 0 && arr[high] < 0) 
			{
				while (arr[high] < 0) 
				{
					high--;
				}
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				high--;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}