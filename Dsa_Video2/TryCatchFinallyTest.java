package Dsa_Video2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyTest {

		public static void main(String[] args)
		{
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter No 1");
				int a=sc.nextInt();
				System.out.println("Enter No 2");
				int b=sc.nextInt();
				int d=add(a,b);
				
				System.out.println("The output is "+d);
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("please enter integers only");
				
			}
			finally {
				System.out.println("Integer not found");
			}
		}
		private static int add(int a, int b)
		{
			
			int c=0;
			try {
				c=a+b;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Plese enter integer only ");
			}
			finally
			{
				System.out.println("finnaly executed ");
				return c;
			}
			
			
			
			//return c;
			
		}
}
