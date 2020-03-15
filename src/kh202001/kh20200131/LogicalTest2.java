package kh202001.kh20200131;

public class LogicalTest2 {
	public static void main(String[] args) {

		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a < b || --a > c++;
//			   5 < 6 OR   4 > 10
//		   	   5 < 6 OR   4 > 11
//				True OR	  False
//			 		 || 앞의 값만 계산하고 뒤의 수식은 계산하지 않는다.
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
		System.out.println(res1);

		System.out.println("");

// a = 4, b = 6, c = 10 가 나와야 정상이지만 a = 5, b = 6, c = 10이 출력된다.
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
		System.out.println("");
//	

		boolean res2;
		res2 = c < b++ && c-- > ++a;
//		   	  10 < 6   AND 10 > 6
//	   	  	  9 < 7    AND 9  > 6   
// a = 6, b = 7, c = 9 가 나와야 정상이지만 a = 5, b = 7, c = 10이 출력된다.
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
		System.out.println(res2);

// 위의 식, 아래의 식 둘 다 || 은 True, &&은 False이기에 앞의 수식만 계산하고 뒤의 수식은 계산하지 않는다.
// 따라서 앞의 수식들만 계산되고 뒤의 수식들은 계산되지 않는다.
// 논리연산자의 단축 연산.

	}
}