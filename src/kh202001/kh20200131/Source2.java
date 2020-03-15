package kh202001.kh20200131;

public class Source2 {

	public static void main(String[] args) {
		
// 이항 연산자 - 논리
// &&, ||, !
// ! 연산자는 단항 연산자
//	
// && -> And		-> 두개의 항이 모두 true 일 때 true를 리턴한다.
// || -> OR		-> 둘 중 하나의 항이 true 라면 true를 리턴한다.
// ! -> Not		-> 부정한다, true는 false로 false는 true로 변환
// 
// 		&&(AND)	True	False		
// 		True	T		F
// 		False	F		F
//
//		||(OR)	True	False		
// 		True	T		T
// 		False	T		F
//
// 		!(NOT)	True	False		
// 		True	F		T
// 		!는 부정형이기에 반대로 출력된다.
//		
//		XOR		True	False	-> XOR은 볼 일 거의 없다.
//		True	F		T
//		False	T		F
// 	

	boolean b1 = true;
	boolean b2 = false;
	
	System.out.println("True && False : " + (b1 && b2));	// 두 개가 다 참이어야 트루가 출력
	System.out.println("True || False : " + (b1 || b2));	// 하나라도 참이라면 트루 출력
	System.out.println("False : " + ! b2);					// b2가 false 이지만 !는 부정형이기에 반대로 true가 출력
	
	System.out.println("");
	
	int num = 88;
	System.out.println((num >= 1) && (num <= 100));			// 두가지를 모두 만족해야한다.
	System.out.println((num >= 1) || (num <= 100));			// 한가지만 만족해도 가능하다.
	
	
	System.out.println((1 <= num) && (num <= 100));
	System.out.println( !((1 <= num) && (num <= 100)) );
	
	
	}
}