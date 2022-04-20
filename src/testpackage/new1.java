package testpackage;

public class new1 {
	
	
	public void display1()
	{
		System.out.println("Method overriding method 1");
		
	}
	public void display1(int i)
	{
		System.out.println("Method overloading method 2="+i);
		
	}
	public static void main(String[] args) {
		new1 n=new new1();
		n.display1();
	    n.display1(3);
		// TODO Auto-generated method stub

	}

}
