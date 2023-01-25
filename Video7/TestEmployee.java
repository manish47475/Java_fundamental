package Video7;


public class TestEmployee {

	
	public static void main(String[] args)
	{
		Employee e=new Employee();
		Example1 e1=new Example1();
		Example2 e2=new Example2();
		e.name="Manish";
		e.age=20;
		e.salary=10000;
		
		e1.name="Pratik";
		e1.age=21;
		e1.salary=20000;
		e1.language="Marathi";
		
		e2.name="rag";
		e2.age=30;
		e2.salary=321112;
		e2.language="hindi";
		e2.dataBaseTool="MySql";
		
		e.printData();
		e1.printData();
		e2.printData();
	}
}
