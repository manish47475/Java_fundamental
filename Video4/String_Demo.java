package Video4;
import java.lang.String;
public class String_Demo {
	
	public static void main(String[] args)
	{
		String a="Hello";
		String b="World";
		String c="     Hello";
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.compareTo(b));
		System.out.println(c);
		System.out.println(c.strip());
		System.out.println(a.isBlank());
		System.out.println(a.substring(1,4));
	}
	
}
