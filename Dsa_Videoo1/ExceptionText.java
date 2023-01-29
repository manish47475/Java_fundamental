package Dsa_Videoo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionText {

	public static void main(String[] args)
	{
		try {
			System.out.println("Welcome to Max Heart Rate Calculator");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age");
			int a=sc.nextInt();
			int maxHeartRate=220-a;
			System.out.println("Your Heart rate is "+maxHeartRate);	
		}
		catch(InputMismatchException e)
		{
			System.out.println("Eneter Integer only");
		}
		
		
	}
}
