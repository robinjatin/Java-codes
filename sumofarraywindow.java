package com.in;
//a code if the finding the sum of certain array window is equal to the desired sum
import java.util.*;
import java.util.stream.IntStream;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		int i,j,x,flag=0,sum=0;
		System.out.println("Input the elements of the array");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the date which will be the sum of the numbers");
		int d=sc.nextInt();
		System.out.println("Enter the month number which will be the element window size");
		int m=sc.nextInt();
		int mar[]=new int[m];
		int k=0;
		for(i=0;i<n-m+1;i++)
		{
			for(j=i;j<i+m;j++)
			{
				sum=sum+ar[j];
				mar[k]=ar[j];
				k++;
			}
			if(sum==d)
			{
				flag=1;
				break;
			}
				k=0;
				sum=0;
		}
		if(flag==1)
			{
				System.out.println("Found sum "+sum+" and the elements are: ");
					for(x=0;x<m;x++)
					{	
						System.out.print(mar[x]+" ");
					}
			}
		else
			{
				System.out.print("Not Found");
			}
		/*
		 //another way with less time complexity
		   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		int i,j,x,flag=0,sum=0;
		System.out.println("Input the elements of the array");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the date which will be the sum of the numbers");
		int d=sc.nextInt();
		System.out.println("Enter the month number which will be the element window size");
		int m=sc.nextInt();
		int car[]=new int[m];
		for(i=0;i<n;i++)
		{
			int mar[]=Arrays.copyOfRange(ar,i,i+m);
			sum=IntStream.of(mar).sum();
			if(sum==d)
			{
				car=mar;
				flag=1;
				break;	
			}
		}
		if(flag==1)
		{
			System.out.println("Found sum "+sum+" and the elements are: ");
				for(i=0;i<m;i++)
				{
					System.out.print(car[i]+" ");
				}
		}
		else
		{
			System.out.println("Not Found");
		}
		 */
	}

}
