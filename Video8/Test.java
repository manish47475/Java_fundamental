package Video8;

public class Test {

	public static void main(String[] args)
	{
		Bank s=new SBI();
		Bank p =new PNB();
		System.out.println("ROI: "+s.rateOfIntrest());
		System.out.println("ROI: "+p.rateOfIntrest());
	}
}
