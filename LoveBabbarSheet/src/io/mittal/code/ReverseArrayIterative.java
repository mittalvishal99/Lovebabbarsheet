package io.mittal.code;

public class ReverseArrayIterative {

	public static void main(String[] args) 
	{

		int arr[]= {1,2,3,4,5};
		int n=5;
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
