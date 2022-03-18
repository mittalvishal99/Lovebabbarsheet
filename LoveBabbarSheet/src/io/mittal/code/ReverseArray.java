//Recursive solution
package io.mittal.code;
import java.util.ArrayList;
public class ReverseArray 
{
	public static void main(String[] args)
	{												//RECURSIVE SOLUTION
		int arr[]= {1,72,3,4,5};
		int n=5;
		ArrayList<Integer>arr2=new ArrayList<>();
		reverse(arr,arr2,n);			
		for(int i=0;i<n;i++)
		{
			System.out.println(arr2.get(i));
		}
	}
	public static void reverse(int arr[],ArrayList<Integer>arr2,int n)
	{
		if(n==1)
		{
			arr2.add(arr[0]);
			return;
		}
		arr2.add(arr[n-1]);
		reverse(arr,arr2,n-1);
	}

}
