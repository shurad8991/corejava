package testpackage;

interface test
{
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	
	
}
public class testinterface implements test{

	public static void main(String[] args) {
		
		testinterface t1=new testinterface();
		t1.method1();
		t1.method2();
		t1.method3();

	}

	@Override
	public void method1() {
		System.out.println("Method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method3");
	}

}
