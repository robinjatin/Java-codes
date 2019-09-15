package com.in;
//a code for printing the string in the reverse order and removing the extra spaces
import java.util.Scanner;
public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		s=s+'\0';
		int len=0;
		
		for(int i=0;s.charAt(i)!='\0';i++)
		{
			len++;
		}
		char schar[]=new char[len];
		for(int i=0;i<len;i++)
		{
			schar[i]=s.charAt(i);
			
		}
		try {	
		for(int i=len-1;i>=0;i--)
		{
			if(schar[i]==' ')
			{
				if(schar[i+1]!=' ')
					System.out.print(schar[i]);
			}
			else
				System.out.print(schar[i]);
		}
		}
		catch(Exception e)
		{
			int num=0;
			if(schar[len-1]==' ')
			{
				
				for(int i=len-1;i>=0;i--)
				{
					if(schar[i]!=' ')
					{
						num=i;
						break;
					}
				}
			}
			for(int i=num;i>=0;i--)
			{
				if(schar[i]==' ')
				{
					if(schar[i+1]!=' ')
						System.out.print(schar[i]);
				}
				else
					System.out.print(schar[i]);
			}
		}

	}

}
