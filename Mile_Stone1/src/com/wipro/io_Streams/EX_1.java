package com.wipro.io_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EX_1 {
	public static void main(String args[]) throws IOException
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String fn=sc.nextLine();
		System.out.println("Enter the character to be count");
		char c=sc.nextLine().charAt(0);
		File f=new File(fn);
		int d=0;
		BufferedReader br=new BufferedReader(new FileReader(f));
		int a;
		do {
			a=br.read();
			if(a>=65 && a<=90)
				a+=32;
			if(c>=65 &&c<=90)
				c+=32;
			if(a==c)
			{
				d++;
			}			
		}while(a!=1);
		System.out.println("File '"+fn+"' has"+d+ " instances of letter '"+a+"'.");
		br.close();
	}
}
