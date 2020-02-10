package kh20200207;

public class Swap {
	public static void main(String[] args) {

		// 스왑, Swap (자리 바꾸기)

		//		i	>	j
		//
		//		-> temp ->
		//
		//	i 가 더 크면
		//	temp에 i
		//	i에 j
		//	j에 템프

		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("스왑 하기 전 " + num1 + " : " + num2);
		
		System.out.println();
		int tmp = num2;
		num2 = num1;
		num1 = tmp;
		// temp 를 제 3 변수로 선언하고 하나의 변수의 값을 백업한다.
		// 마지막에 temp 의 값을 대입해주면 저글링 하는 거 처럼 스왑
		
		System.out.println("스왑 하고 난 후 " + num1 + " : " + num2);
		
	} // Main End
} // Class End