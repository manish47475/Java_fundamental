package Dsa_Video4;

import java.util.ArrayDeque;
import java.util.Iterator;

public class StackUsingDeque {

	public static void mains(String[] args)
	{
		ArrayDeque<String> d=new ArrayDeque<String>();
		
		d.add("Manish");
		d.add("Pratik");
		d.addLast("new person");
		d.offerFirst("Mate");
		d.offer("demo");
		System.out.println("First Element "+d.getFirst());
		System.out.println("Last Element "+d.getLast());
		
		System.out.println(d.contains("Manish"));

		
		Iterator i=d.descendingIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.hasNext());
		}
	}
}
