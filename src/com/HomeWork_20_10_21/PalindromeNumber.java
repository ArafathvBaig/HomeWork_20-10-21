package com.HomeWork_20_10_21;

import java.util.Scanner;

public class PalindromeNumber
{
	public static void palindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int r;
		int sum=0;
		int temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("The given number "+temp+" is Palindrome");
		}
		else
		{
			System.out.println("The given number "+temp+" is Not a Palindrome");
		}
	}

	public static void main(String[] args) 
	{
		palindrome();
	}
}
