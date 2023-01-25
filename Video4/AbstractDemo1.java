package Video4;

public class AbstractDemo1 extends AbstractDemo{

	
	public void anothermethod() {
		System.out.println("Abstract Method");
		
	}
	public static void main(String[] args)
	{
		AbstractDemo obj= new AbstractDemo1();
		obj.anothermethod();
		System.out.println(" ");
		obj.myMethod();
	}
	
}
