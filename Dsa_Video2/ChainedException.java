package Dsa_Video2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChainedException {

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your height in cm ");
			float height =sc.nextInt();
			
			double idealWeight=50+(0.91*(height-152.4));

			System.out.println("your ideal weight is : "+idealWeight);
		}
		catch(InputMismatchException e)
		{
			throw new NumberFormatException();
		}
		
	}
}
