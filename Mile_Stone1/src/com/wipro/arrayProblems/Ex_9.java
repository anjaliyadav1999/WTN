package com.wipro.arrayProblems;

public class Ex_9 {
	public static void main(String args[])
	{
		int a[]=new int[20];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int b[]=new int[100];
		int k=0;
		for(int i=0;i<args.length;i++)
		{
			if(a[i]==10)
			{
			}
			else
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=k;i<args.length;i++)
		{
			b[i]=0;
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
