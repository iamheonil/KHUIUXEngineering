package kh202002.kh20200211_method;

// 02번 설계 파일

public class Method_02 {

	// 매개변수
	// 반환데이터 (return 코드)
			
	// method01 은 매개변수도 없고 리턴데이터도 없다.
	public void method01() {
		System.out.println("Hello!");
	}
	
	// method02 는 매개변수가 있고 리턴데이터는 없다.
	public void method02(int parameter) {		
		System.out.println("전달된 값 : " + parameter);
		
		// parameter(매개변수)
		// argument(전달인자, 전달인수)
	}
	
	public void printNum2(int num1, int num2) {
		System.out.println("num1 = " + num1 + ", num2 = " + num2);		
	}
	
	// 매개변수 없고 반환데이터는 있따.
	public int returnNum() { 
		
		return 777;

	}
	
	// 매개변수도 있고 반환데이터도 있는 상태
	public int add(int n1, int n2) {
		
		return n1 + n2;
	}


}