package Dsa_Video4;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>()  ;
		
		System.out.println("is stack empty "+s.isEmpty());
		
		s.push(10);
		s.push(20);
		
		System.out.println("Get the top Element"+s.peek());
		System.out.println("Is Stack contains 20 "+s.search(20));
		s.pop();
		System.out.println(s.peek());
	}
}
