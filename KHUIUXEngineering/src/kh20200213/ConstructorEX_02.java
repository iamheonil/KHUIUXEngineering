package kh20200213;

class Constructor02 {
	// 설계 클래스, 멤버필드
	private int num1;
	private int num2;

	// 디폴트 생성자
	public Constructor02() {
		System.out.println("디폴트 생성자.");
		this.num1 = 100;
		this.num2 = 200;
		
		// this 는 자기참조 객체라고도 하는데, 자기자신을 참고할 수 있다
		// 안 써도 상관없으나 Getter, Setter 사용시 매개변수 구분을 위해 작성한다.	
	}

	// 매개변수가 int형 하나인 생성자
	// '전달인자'를 이용해 num1 을 초기화한다.
	public Constructor02(int num1) {
		System.out.println("매개변수가 하나인 생성자");
		this.num1 = num1;
		this.num2 = 600;
	}

	// 매개변수가 두개인 생성자
	// '전달인자'를 이용해 num1 을 초기화한다.
	public Constructor02(int num1, int num2) {
		System.out.println("매개변수가 두개인 생성자");
//		this.num1 = num1;
//		this.num2 = num2;

		// Setter 를 사용하여 초기화 가능하다.
		setNum1(num1);
		setNum2(num2);
		// Setter 를 사용하여 초기화하는게 조금 더 좋은 방법
	}
	
	
	// 모든 변수(요소)를 출력하는 기능
	public void out() {
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}

	// 멤버필드 만들고 Getter Setter 생성은 자연스럽게 바로 하도록 하자.
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}

public class ConstructorEX_02 {
	public static void main(String[] args) {
		// 실행 클래스, 멤버 메소드

		Constructor02 cons02 = new Constructor02();
		cons02.out();
		System.out.println();
		Constructor02 cons03 = new Constructor02(5050);
		cons03.out();
		System.out.println();
		Constructor02 cons04 = new Constructor02(600, 800);
		cons04.out();
		
	}
}
