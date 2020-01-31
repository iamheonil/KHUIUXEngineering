package kh20200131;

public class LogicalTest2 {
	public static void main(String[] args) {

		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a < b || --a > c++;
//			   5 < 6 OR   4 > 10
//		   	   5 < 6 OR   4 > 11
		
		System.out.println("a=" + a + "\nb=" + b + "\nc="+c);
		
		System.out.println("");
		
// a = 5, b = 6, c = 10
		
		boolean res2;
		res2 = c < b++ && c-- > ++a;
//		   	  10 < 6   AND 10 > 6
//	   	  	  10 < 7   AND 9  > 6
		
		System.out.println("a=" + a + "\nb=" + b + "\nc="+c);

	}
}