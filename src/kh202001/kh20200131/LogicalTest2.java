package kh202001.kh20200131;

public class LogicalTest2 {
	public static void main(String[] args) {

		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a < b || --a > c++;
//			   5 < 6 OR   4 > 10
//		   	   5 < 6 OR   4 > 11
//				True OR	  False
//			 		 || ���� ���� ����ϰ� ���� ������ ������� �ʴ´�.
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
		System.out.println(res1);

		System.out.println("");

// a = 4, b = 6, c = 10 �� ���;� ���������� a = 5, b = 6, c = 10�� ��µȴ�.
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
		System.out.println("");
//	

		boolean res2;
		res2 = c < b++ && c-- > ++a;
//		   	  10 < 6   AND 10 > 6
//	   	  	  9 < 7    AND 9  > 6   
// a = 6, b = 7, c = 9 �� ���;� ���������� a = 5, b = 7, c = 10�� ��µȴ�.
		System.out.println("a=" + a + "\nb=" + b + "\nc=" + c);
		System.out.println(res2);

// ���� ��, �Ʒ��� �� �� �� || �� True, &&�� False�̱⿡ ���� ���ĸ� ����ϰ� ���� ������ ������� �ʴ´�.
// ���� ���� ���ĵ鸸 ���ǰ� ���� ���ĵ��� ������ �ʴ´�.
// ���������� ���� ����.

	}
}