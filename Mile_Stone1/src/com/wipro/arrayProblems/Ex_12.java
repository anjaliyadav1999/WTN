package com.wipro.arrayProblems;

public class Ex_12 {
	public static void main(String args[])
	{
		int a[]=new int[10];
		int b[]=new int[10];
		for(int i=0;i<args.length/2;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=args.length/2;i<args.length;i++)
		{
			b[i]=Integer.parseInt(args[i]);
		}
		System.out.println(a[2]+" "+b[4]+" ");
	}
}

