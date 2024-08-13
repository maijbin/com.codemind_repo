package com.codmind_java;

public class Array_program {

	public static void main(String[] args) {
		int arr[]= {10,50,90,40,5,9,100,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)	
			{
				if(arr[i]>arr[j])           //for descending arr[j]>a[i]
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println("Largest element:" +arr[0]);
		System.out.println("Smallest element:" +arr[arr.length-1]);

	}

}
