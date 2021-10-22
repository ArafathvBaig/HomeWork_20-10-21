package com.HomeWork_20_10_21;

import java.util.Scanner;

public class Factorial 
{
	
	public static void fact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int count = 1;
		for(int i=count; i<=n; i++)
		{
			count = count*i;
			System.out.println(+i);
		}
		System.out.println("Factorial of "+n+" is: "+count);
		/*int f = n;
		for(int i=(n-1); i>=1; i--)
		{
			f = f*i;
		}
		System.out.println("Factorial of "+n+" is: "+f);
		*/
	}

	public static void main(String[] args) 
	{
		fact();
	}

}
