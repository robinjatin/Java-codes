import java.util.Arrays;
//a code for finding the missing number in an array
import java.util.Scanner;
public class St1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++)
		{
			int n=sc.nextInt();
			int n1=n-1;
			int arr[]=new int[n1];
			for(int j=0;j<n1;j++)
			{
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			int num=0;
			/*int sum=0;
			int arr2[]=new int[n];
			for(int j=1;j<=n;j++)
			{
				sum=sum+j;
			}
			int sum1=0;
			*/
			for(int j=0;j<n1;j++)
			{
				//sum1=sum1+arr[j];
				if(arr[j]!=j+1)
				{
					num=j+1;
				}
			}
			//int sum2=sum-sum1;
			if(num>0)
			System.out.println(num);
			else
			System.out.println(n);
			
			//System.out.println(num);
		}
			
	}

}
