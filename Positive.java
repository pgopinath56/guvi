import java.util.*;
class Positive
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("INPUT: ");
		int num=S.nextInt();
		System.out.println("OUTPUT: ");
		if(num>0)
		{
			System.out.println("Positive");
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else if(num==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}

