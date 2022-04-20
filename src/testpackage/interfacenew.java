package testpackage;
interface int1
{
	abstract void test1();
	abstract void test2();
}
interface int2
{
	abstract void test2(int a);
	
}
public class interfacenew implements int1,int2 {
	 
	public void test1()
	{
		System.out.println("incomplete method1");
	}
	public void test2()
	{
		System.out.println("Incomplete method2");
	}
	public void test2(int a)
	{
		System.out.println("Incomplete method 3");
	}
	public static void main(String[] args) {
		interfacenew i1=new interfacenew();
		i1.test1();
		i1.test2();
		i1.test2(10);
	}

	
	
}
