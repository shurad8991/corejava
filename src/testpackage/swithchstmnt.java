package testpackage;

import java.util.Scanner;

public class swithchstmnt {

	public static void main(String[] args) {
		System.out.println("enter 1 to 3");
		for (int i = 1; i <= 3; i++)
		{
			
			Scanner sc = new Scanner(System.in);
			int day = sc.nextInt();
			//sc.close();
			if(day==1||day==2||day==3)
			{
			switch (day)
			{
			case 1:
				System.out.println("1st case");
				break;
			case 2:
				System.out.println("2nd case");
				break;
			case 3:
				System.out.println("3rd case");
				break;
				default:System.out.println("not match");
				break;
			}
			}
			else
				System.out.println("enter valid number");

		}
	}

}
