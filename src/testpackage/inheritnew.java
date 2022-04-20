package testpackage;

public class inheritnew extends new1{
	
	public void display1()
	{
		System.out.println("Method overridind method 2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritnew i=new inheritnew();
		i.display1();
		new1 n=new new1();
		n.display1();

	}

}
