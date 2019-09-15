import java.util.Scanner;
//a code for finding if there will be boxes left after all the apples are filled in the boxes. 
public class Boxapples {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of boxes and apples");
		int box=sc.nextInt();
		int apples=sc.nextInt();
	    int x=apples/box;
		if(x%box!=0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
