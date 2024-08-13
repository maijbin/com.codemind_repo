package com.codmind_java;

public class Fibonacci_series {

	public static void main(String[] args) {
		for(int j=2;j<=10;j++)
		{
			for(int k=1;k<=10;k++)
			{
				System.out.print(j*k+" ");
			}
			System.out.println("");
		}
		System.out.println("************************");
		int l=2;
		while(l<=10)
		{
			int m=1;
			while(m<=10)
			{
			
			System.out.print(l*m +"\t");
			m++;
		}
			System.out.println("");
		l++;
		}
		System.out.println("*************************************");
		int num1=0,num2=1;
		System.out.print(num1+"\t"+num2+"\t");
		for(int h=1;h<=10;h++)
		{
			int num3=num1+num2;
			System.out.print(num3+"\t");
			num1=num2;
			num2=num3;
		}
		System.out.println("\n");
		System.out.println("**************************");
		int num=19;
		boolean prime=true;
		
		for(int i=2;i<num/2;i++)
		{
			if(num%2==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		{
			System.out.println("num is prime:"+num);
			
		}
			else
			{
				System.out.println("num is not prime:"+num);
		}
	}

}
