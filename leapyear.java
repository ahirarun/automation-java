package test;
import java.util.Scanner;

public class leapyear 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);

		System.out.println("enter the year:");
		int year = Sc.nextInt();

		if(year % 4 == 0 )
		{
			System.out.println("This is a Leap Year");
		}
		else
		{
			System.out.println("This is Not a Leap Year");
		}
	}
}
