package io.mittal.code;

public class PascalTriangle {

	public static void main(String[] args) 
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int space=1;space<n-i;space++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				int f=factorial(i);
				int m=factorial(j);
				int o=factorial(i-j);
				System.out.print((f)/(m*o)+" ");
			}System.out.println();
		}
	}
	public static int factorial(int i)
	{
		int mul=1;
		for(int val=1;val<=i;val++)
		{
			mul=mul*val;
		}
		return mul;
	}

}
