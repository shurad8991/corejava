package testpackage;

public class reversestring {

	public static void main(String[] args) {
		String s="Shubhangi";
		int n = s.length();
		String s1 = "";
		char c;
		for(int i=0;i<n;i++)
		{
			c=s.charAt(i);
			 s1=c+s1;
		}
		System.out.println(s1);
		
	}

}
