package testpackage;

abstract class  test1
{
	abstract void test1();
	void test2()
	{
		System.out.println("complete method");
	}
}

public class abstractclass extends test1 {

	public static void main(String[] args) {
		abstractclass a1=new abstractclass();
		a1.test1();
		a1.test2();

	}

	@Override
	void test1() {
		System.out.println("incomplete method");
		
	}

}
