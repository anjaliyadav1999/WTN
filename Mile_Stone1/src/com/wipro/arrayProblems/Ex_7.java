package com.wipro.arrayProblems;

import java.util.Arrays;

public class Ex_7 {
	public static void main(String args[]) {
		int a[]= {12,34,12,48,67,89};
		int l=a.length;
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<l-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
		a[j++]=a[l-1];
		for(int i=0;i<j;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
