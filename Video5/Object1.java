package Video5;

public class Object1 {
		String name;
		int rollno;
		int age;
		 void info()
		{
			System.out.println("Name : "+name);
			System.out.println("Roll NO : "+rollno);
			System.out.println("Age : "+age);			
		}
		public static void main(String[] args)
		{
			Object1 o=new Object1();
			o.name="Manish";
			o.rollno=13;
			o.age=20;
			o.info();
		}
}
