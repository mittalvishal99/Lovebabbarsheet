package io.mittal.code;

public class HourGlassPattern {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=(2*n-1);i++)
		{
			int s;
			if(i>5)
			{
				s=2*n-i;
			}else {
				s=i;
			}
			for(int space=1;space<s;space++)
			{
				System.out.print(" ");
			}
			for(int j=s;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

