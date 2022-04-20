package testpackage;

public class childobjectcast extends parentobjectcast{
	
	void test()
	{
		System.out.println("child test class");
		
	}
	public static void main(String[] args) {
		parentobjectcast p=new childobjectcast();//upcasting.. implicitely done
		p.test();
		p.test1();
		
		childobjectcast c=(childobjectcast)p;//dawncasting ...explicitely done
		c.age=18;
		//c.test1();
		System.out.println(c.age);
		   
		
	}

}
