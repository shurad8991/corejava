package testpackage;

public class newtest {
	int i=1;

	newtest()
	{
	 
		System.out.println("parent class constrctr1");
	}
	newtest(int i)
	{
		this();
		System.out.println("parent class constrctr2  ="+i);
		System.out.println("parent class constrctr2  ="+this.i);
	}
	public static void main(String[] args) 
	{
		newtest n=new newtest(3);//parameterised cnstr
		newtest n1=new newtest();//default cnstr
		System.out.println(new newtest(5));
		

		
		
	}

}
