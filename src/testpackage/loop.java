package testpackage;

public class loop {
	
	int a1=1;

	public int fact(int a) {
		int a1=2;
		System.out.println("a1:"+a1);
		if (a == 0)
			return 1;
		else
			return a * fact(a - 1);
		
		
	}

	public static void main(String[] args) {
		/*
		 * for(int i=1;i<=5;i++) {
		 * 
		 * System.out.print(" "); 
		 * for(int j=1;j<=i;j++)
		 *  { 
		 *  System.out.print("*"); 
		 *  }
		 * System.out.println(" "); }
		 */
		loop l = new loop();
		for (int i = 1; i <= 5; i++) // pascal triangle
		{
			for (int k = 5; k > i; k--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {

				// nCr formula
				System.out.print(" " + l.fact(i) / (l.fact(i - j) * l.fact(j)));
			}

			// for newline
			System.out.println();

		}

	}
}