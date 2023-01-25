package Video5;
import java.util.Scanner;
public class ArrayDemo1 {

	public static void main(String[] args)
	{
		int n;
		System.out.print("Enter number of element you want to store in array : ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter element inside arry :");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Elenebt inside array are : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
