package com.wipro.arrayProblems;

public class Ex_6 {
	public static void main(String args[])
	{
		int temp;
		int a[]=new int[20];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<args.length;i++)
		{
			for(int j=0;j<args.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted Elements: ");
		for(int i=0;i<args.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
