package Dsa_video7;

import java.util.ArrayList;

public class ToArrayTest {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("manish");
		a.add("raj");
		a.add("aman");
		
		Object[] b=a.toArray();
		System.out.println(b[0]);
		System.out.println(b[0].hashCode());
	}
}
