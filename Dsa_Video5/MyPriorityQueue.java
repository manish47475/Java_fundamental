package Dsa_Video5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;



public class MyPriorityQueue {

	public static void main(String[] args)
	{
		PriorityQueue q1=new PriorityQueue();
		
		System.out.println("Is empty "+q1.isEmpty());
		
		MyComparator m=new MyComparator();
//		MyPriorityQueue m=new MyPriorityQueue();
		PriorityQueue q2=new PriorityQueue(m);

		q1.add(10);
		q2.add(10);
		
		q1.add(5);
		q2.add(5);
		
		q1.add(100);
		q2.add(100);


		
		Iterator i1=q1.iterator();
		Iterator i2=q2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		System.out.println("");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
			
		}
	}


}
