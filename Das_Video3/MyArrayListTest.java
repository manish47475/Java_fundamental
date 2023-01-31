package Das_Video3;

import java.util.ArrayList;

public class MyArrayListTest {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println("Printing list 1 ");
		
		System.out.println(a.get(1));
		System.out.println(a.get(0));
		System.out.println(a.get(4));
		
		System.out.println("Updating list ");
		a.add(1, 6);
		
		System.out.println(a.get(1));
		
		System.out.println("Printing list 2");
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		System.out.println(a1.get(1));
		System.out.println(a1.get(0));
		System.out.println(a1.get(4));
		
		a1.clear();
		try {
			System.out.println(a1.get(1));
			System.out.println(a1.get(0));
			System.out.println(a1.get(4));
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("List is cleared");
		}
		
		System.out.println("ArrayList clone");
		ArrayList a2=(ArrayList)a.clone();
		System.out.println(a2.get(1));
		System.out.println(a2.get(0));
		System.out.println(a2.get(4));
		
		System.out.println("checked if there is 6");
		boolean result=a.contains(6);
		if(result==true)
		{
			System.out.println("Item exists");
		}
		else
		{
			System.out.println("Item does not exist");
		}
		
	}
}
