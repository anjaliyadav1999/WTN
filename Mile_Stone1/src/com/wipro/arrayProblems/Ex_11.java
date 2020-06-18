package com.wipro.arrayProblems;

public class Ex_11 {
	public static void main(String args[])
	{
		int a[]=new int[100];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int flag=0;
		for(int i=0;i<args.length;i++)
		{
			if(a[i]!=1 && a[i]!=4)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
}
