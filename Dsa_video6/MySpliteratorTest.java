package Dsa_video6;

import java.util.ArrayList;
import java.util.Spliterator;

public class MySpliteratorTest {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Post1");
		a.add("Post2");
		a.add("Post3");
		a.add("Post4");
		a.add("Post5");
		a.add("Post6");
		
		Spliterator<String> s=a.spliterator();
		Spliterator<String> s1=s.trySplit();
		
		System.out.println("spl1   "+s.estimateSize());
		System.out.println("spl1   "+s.getExactSizeIfKnown());
		s.forEachRemaining(System.out::println);
		System.out.println("spl1   "+s.estimateSize());
		System.out.println("spl1   "+s.getExactSizeIfKnown());
		
		System.out.println("spl2   "+s1.estimateSize());
		System.out.println("spl2   "+s1.getExactSizeIfKnown());
		s1.forEachRemaining(System.out::println);
		System.out.println("spl2   "+s1.estimateSize());
		System.out.println("spl2   "+s1.getExactSizeIfKnown());
		
		
	}
}
