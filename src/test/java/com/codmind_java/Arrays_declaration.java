package com.codmind_java;

public class Arrays_declaration {

	public static void main(String[] args) {
		int a[]= {10,20,60,40,50,90};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println(" ");
		System.out.println("***************************************************");
		int b[][]= {{10,20,60,40},{50,90,100},{200,500,400},{300,45,97}};
		for(int m=0;m<b.length;m++)
		{
			for(int n=0;n<b[m].length;n++)
			{
				System.out.print(b[m][n]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("**************************************");
		
		//System.out.println("Rows"+b[0].length);
		//System.out.println("Columns"+b[0].length);
		
	}

}