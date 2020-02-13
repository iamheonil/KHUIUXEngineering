package kh20200213;

class Constructor01 {
	// 설계클래스, 멤버필드

	private int num1;
	private int num2 = 20;

	public Constructor01() {
		System.out.println("디폴트 생성자 호출됨!");
		
		System.out.println(num1);
		System.out.println(num1);
		System.out.println("-----");
		num1 = 500;
		num2 = 600;
	}

	// 매개변수가 있는 생성자
	public Constructor01(int num1, int num2) {
		System.out.println("매개변수 있는 생성자 호출됨");
		this.num1 = num1;
		this.num2 = num2;
		
		setNum1(num1);
		setNum2(num2);
				
	}
	
//	public void Constructor01() {
//		
//	}
	// 일반 메소드 - 생성자와 헷갈리니까 절대 이렇게 만들면 안된다.
	
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

public class ConstructorEx_01 {
	public static void main(String[] args) {
		// 실행클래스, 멤버메소드

		Constructor01 cons = new Constructor01();
		System.out.println("cons.num1 : " + cons.getNum1());
		System.out.println("cons.num2 : " + cons.getNum2());
		
		System.out.println();
		
		Constructor01 cons02 = new Constructor01(111, 222);
		System.out.println("cons.num1 : " + cons.getNum1());
		System.out.println("cons.num2 : " + cons.getNum2());
		
	}

}
