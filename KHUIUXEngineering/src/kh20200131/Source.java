package kh20200131;

public class Source {
	public static void main(String[] args) {

// 이항 연산자 - 관계연산자라고 부르기도하고 비교연산자라고 부르기도 한다.
// <, >, <=, >=, ==, !=		// ! 는 부정형(Not)이기에 != 는 같지 않다가 되는것이다.
// lt, gt, le, ge, eq, ne 축약어
// less than, greater than, less than equal, greater than equal, equal, not equal
// 작은			큰			작거나 같은			크거나 같은		 같은	같지 않은
// 축약어는 외우는것이 좋다.
// 관계연산의 결과(리턴)는 참, 거짓(Boolean타입) 으로 표현된다.
// 
// 
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 == num2 : " + (num1 == num2));	// False
		System.out.println("num1 != num2 : " + (num1 != num2)); // True

		System.out.println("num1 < num2 : " + (num1 < num2));	// True
		System.out.println("num1 > num2 : " + (num1 > num2)); 	// False
		
		System.out.println("num1 <= num2 : " + (num1 <= num2));	// True
		System.out.println("num1 >= num2 : " + (num1 >= num2)); // False
		
		System.out.println("===============================================");

// 별 차이는 없지만 boolean 이 어떤식으로 동작하는지 알아보기 위한 코드 작성
		
		boolean res1;
		boolean res2;
		
		res1 = num1 < num2;
		res2 = num1 == num2;
		
		System.out.println("res1 의 값  : " + res1); // true
		System.out.println("res2 의 값  : " + res2); // false
		
	}
	
}