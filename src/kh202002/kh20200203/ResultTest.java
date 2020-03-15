package kh202002.kh20200203;

public class ResultTest {
	public static void main(String[] args) {

// ScannerQuiz2의 Result Test를 하기 위해 만든 Class
// Result의 값을 소숫점 둘째자리까지만 출력한다.
		
		int a = 100, b = 99,c = 97;
		
		double result = (a + b + c) / (double)3;
		
//		System.out.println(result);
// 		-> 98.66666666666667
		
//		1. String.format() 이용하기
		String Cresult = String.format("%.2f", result);	// %.2f -> 2f 두번째자리 까지만
		System.out.println(Cresult);
		
//		2. System.out.printf() 이용하기
		System.out.printf("%.2f", result);
		System.out.println("");
		
//		3. double 데이터타입을 유지하며 변환하기
		double formatted = Math.round(result * 100) / (double)100;
		System.out.println(formatted);
		
		
// 1번 아니면 2번을 사용 많이할 듯.
	}
}
