package kh20200220;

public class MathEx {
	public static void main(String[] args) {

		// 원주율 출력
		System.out.println(Math.PI);

		// -10 의 절대값
		System.out.println(Math.abs(-10));

		// 3.7의 올림값
		System.out.println(Math.ceil(3.7));

		// 3.7의 내림값
		System.out.println(Math.floor(3.7));

		// -3.7의 반올림값
		System.out.println(Math.round(-3.7));

		// 2.1의 3제곱값
		System.out.printf("%.3f", Math.pow(2.1, 3));

		System.out.println("\n");
		System.out.println("더 큰 값 : " + Math.max(3.14, 3.141592));
		System.out.println("더 작은 값 : " + Math.min(100, 200));

		int n1 = 11;
		int n2 = 19;
		System.out.println();
		for (int i = Math.min(n1, n2); i < Math.max(n1, n2); i++) {

		}
		// 랜덤 0.0 (포함) ~ 1.0(제외) double형 랜덤 숫자 생성
//		System.out.println(Math.random());

		
		// 	Random Number, 난수
		//		- 의사 난수(꾸며진 난수, 진짜가 아님)
		//		- 알 수 없는 값
		//		- Pseudo Random
		//			** Pseudo, 수도, 슈도 : 가짜의, 꾸며진
		//	 		
		// 의사 난수 생성 원리
		// 	기초값 (Seed)을 복잡한 연산을 통해 역으로 추적하기 힘들게 만든다.
		// 	하지만 Seed가 고정되거나 미리 연산식을 알고 있다면 결과가 예측된다.
		//		해결법 -> Seed를 계속 바꾼다.
		// 	Seed HardWare Clock으로 이용한다.
		// 		HardWare Clock : 1970년 1월 1일 00시를 기준으로 현재까지 흘러간 초
		// 
		// 난수를 연속적으로 추출할 때에는 이전 난수를 Seed로 사용한다. 
		//
		// public static double Math.random(); 메소드를 이용하여 의사난수를 생성한다.
		// 
		// Random 클래스를 사용한다.
		// 
		//
		//
		
		
		System.out.println((int) (Math.random() * 5) + 1);

		// 1. 가위 2. 바위 3. 보
		System.out.println((int) (Math.random() * 3) + 1);
		

	}
}
