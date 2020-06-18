package com.wipro.arrayProblems;

public class Ex_11 {
	
	public static boolean only14(int a[])
	{
		for(int i:a)
		{
			if(i==1 || i==4)
			{
				continue;
			}
			else
			{
			return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int a[]=new int[100];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println(only14(a));
	}
}
