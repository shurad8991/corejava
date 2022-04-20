package testpackage;

public class oerloadprogram extends overridingprogram{
	
	void test()
	{
		System.out.println("Overriding method child class");
	}
	void test(int n)
	{
		System.out.println("Overload method2 :"+n);
	}

	public static void main(String[] args)
	{
		oerloadprogram o=new oerloadprogram();
		o.test();
	
		String s=new String("shubha");
		System.out.println(s.charAt(1));
		System.out.println(s.length());
		
		
		overridingprogram o1=new overridingprogram();
		o1.test();

	}

}
