package com.wipro.arrayProblems;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=args.length;
		int a[]=new int[l];
		int index1=-1,index2=-1,sum=0;
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==6)
				index1=i;
			if(a[i]==7)
				index2=i;
		}
		if(index1==-1||index2==-1||index1>index2)
		{
			for(int i=0;i<l;i++)
			{
				sum+=a[i];
			}
		}
		else
		{
			for(int i=0;i<index1;i++)
			{
				sum+=a[i];
			}
			for(int i=index2+1;i<l;i++)
			{
				sum+=a[i];
			}
		}
		System.out.println("Sum: "+sum);
	}

}
