package com.wipro.exception;
import java.util.*;
import java.io.*;
public class Ex_1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number of elements in the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		try
		{
			System.out.println("Enter the elements in an array");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int index=sc.nextInt();
			System.out.println("The array element at index " + index + " = " +a[index]);
			System.out.println("The array element succesfully accessed");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException d)
		{
			System.out.println("java.util.NumberFormatException");
		}
	}
}

