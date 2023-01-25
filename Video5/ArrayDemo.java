package Video5;
import java.util.Scanner;
public class ArrayDemo {
	
	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Enter element you want to search ");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		int i;
		boolean foundInt=false;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				foundInt=true;
				break;
			}
		}
		if(foundInt==true)
		{
			System.out.println("Found "+search+" at index "+i);
		}
		else
		{
			System.out.println("Element not found");
		}
		
	}
}
