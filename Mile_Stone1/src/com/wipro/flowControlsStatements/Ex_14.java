package com.wipro.flowControlsStatements;

public class Ex_14 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int red,sum=0,c=0,a=n;
		for(int i=0;i<=n;i++)
		{
			red=n%10;
			c++;
			n=n/10;
		}
		for(int i=0;i<=c;i++)
		{
			red=a%10;
			sum=sum+red;
			a=a/10;
		}
		System.out.println(sum);
	}
}
