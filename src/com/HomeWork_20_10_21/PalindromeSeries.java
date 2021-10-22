package com.HomeWork_20_10_21;

import java.util.Scanner;

public class PalindromeSeries 
{
	public static void palindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int count=0;
		int temp = 0, temp1, temp2;
		for(int i=1; i<=n; i++)
		{
			if(n%2==0)
			{
				if(i<=(n/2))
				{
					count=(count*10)+i;
					temp=count;
				}
				else
				{
					count=(count*10)+((n-i)+1);
				}
			}
			else
			{
				if(i<=((n+1)/2))
				{
					count=(count*10)+i;
					temp=count;
				}
				else
				{
					count=(count*10)+((n-i)+1);
				}
				
			}
		}
		System.out.println(+count);
	}

	public static void main(String[] args) 
	{
		palindrome();
	}

}
