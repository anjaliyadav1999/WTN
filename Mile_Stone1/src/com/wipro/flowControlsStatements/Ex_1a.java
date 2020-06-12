package com.wipro.flowControlsStatements;

public class Ex_1a {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a<0)
		{
			System.out.println(a+" is Negative");
		}
		else if(a==0)
		{
			System.out.println(a+" is Zero");
		}
		else
		{
			System.out.println(a+" is Positive");
		}
	}
}
