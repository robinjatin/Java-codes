package com.in;
//a code for finding the least number of jumps from either side to reach a certain block
import java.util.Scanner;
public class srilanka {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size,x,min=0,half=0;
		size=sc.nextInt();
		x=sc.nextInt();
		half=size/2;
		if(x==1||x==size)
			min=0;
		if(x>half)
			min=(size-x)/2;
		else
			min=x/2;
		System.out.println(min);
	/*	int size=n/2+1;
		int arr[]=new int[size];
		arr[0]=1;
		if(n%2==0)
		{
			arr[size-1]=n;
		}
		else
		{
			arr[size-1]=n-1;
		}
		for(int i=1;i<size-1;i++)
		{
			arr[i]=i*2;
		}
		int num=0,num1=0;
		int x=sc.nextInt();
		if(x%2==0)
		{
			for(int i=0;i<size;i++)
			{
				if(arr[i]==x)
				{
					num=i;
				}
			}
			num1=size-num-1;
		}
		else
		{
			for(int i=0;i<size;i++)
			{
				if(arr[i]==x-1)
				{
					num=i;
				}
			}
			num1=size-num-1;
		}
		if(num<num1)
			System.out.println(num);
		else
			System.out.println(num1);*/
	}

}
