package com.wipro.flowControlsStatements;

public class Ex_17 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int a=n;
		int red,rev=0;
		while(n!=0)
		{
			red=n%10;
			rev=rev*10+red;
			n=n/10;
		}
		if(a==rev)
		{
			System.out.println(a+" is a Palindrome");
		}
		else
		{
			System.out.println(a+" is not a Palindrome");
		}
	}
}
