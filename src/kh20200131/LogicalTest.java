package kh20200131;

public class LogicalTest {
	public static void main(String[] args) {

		// 변수 선언코드
		int a = 5, b = 6, c = 10, d;

		// d의 결과를 대입하는 코드
		// a는 전위 b는 후위
		d = ++a * b--;

		System.out.println("a : " + a + "\nb : " + b + "\nd : " + d);
		// 원래 답은 30이지만 b-- 가 후위연산자기 때문에 후위인 상태에서 d가 계산되어 출력된다.
		// 그래서 a와 b 각각 전위, 후위 계산되어 출력되지만 답은 36

		System.out.println("");
		d = a++ + ++c - b--;
//			6	 11		5
//			7	 11		4
//		위의 전위, 후위 계산법과 똑같다.
		System.out.println("a : " + a + "\nb : " + b + "\nc : " + c + "\nd : " + d);

	}
}
