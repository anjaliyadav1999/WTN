package com.wipro.exception;
import java.util.*;
public class EX_2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,s=0;
		float avg=0;
		try
		{
			for(i=0;i<n;i++) 
			{
				a[i]=sc.nextInt();
			    s=s+a[i];
			}
			avg=s/n;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("Sum is : "+s);
		System.out.println("Average is : "+avg);
	}
}