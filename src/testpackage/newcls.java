package testpackage;

public class newcls {
	
	static void display1()
	{
		System.out.println("Static method");
	}
	void diplay2()
	{
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        newcls n=new newcls();
        n.diplay2();
        display1();
	}

}
