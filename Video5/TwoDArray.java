package Video5;
import java.util.Scanner;
public class TwoDArray {

	
	public static void main(String[] args)
	{
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter 2D array Size : ");
//		int row=sc.nextInt();
//		int cols=sc.nextInt();
//		System.out.println("Enter Array elements: ");
//		int[][] a=new int[row][cols];
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;i<cols;j++)
//			{
//				a[i][j]=sc.nextInt();
//			}
//			
//		}
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();

	        int[][] a = new int[rows][cols];

	        // Fill the array with user input
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Enter the value for array[" + i + "][" + j + "]: ");
	                a[i][j] = scanner.nextInt();
	            }
	        }
//		int a[][]= {{20,40},{10,30}};
		System.out.println("Elements inside 2d array are :");
		for(int []x:a)
		{
			for(int y:x)
			{
				System.out.print(y+"      ");
			}
			System.out.println("");
		}
	}
	
	
	
	
}
