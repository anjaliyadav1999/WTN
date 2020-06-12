package com.wipro.flowControlsStatements;

public class Ex_16 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int red,rev=0;
		while(n!=0)
		{
			red=n%10;
			rev=rev*10+red;
			n=n/10;
		}
		System.out.println(rev);
	}
}
