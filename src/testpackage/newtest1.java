package testpackage;

public class newtest1 extends newtest
{
	static int i=10;
	newtest1()
	{
		super();
	    System.out.println("child class constrctr1");
	}

	newtest1(int i)
	{
		super();
		System.out.println("child class constrctr2:"+this.i);
		System.out.println("child class constrctr2:"+i);
	}
	public static void main(String[] args) 
	{
		newtest1 n=new newtest1(2);
		
	}

}
