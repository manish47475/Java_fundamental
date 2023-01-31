package Dsa_Video2;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		
		if(age<=0)
		{
			throw new NumberFormatException();
		}
		else if(age>=120)
		{
			throw new NumberFormatException();
		}
		
		int maxHeartRate=220-age;
		System.out.println("Your Heart rate is "+maxHeartRate);	
	}

}
