package kh202002.kh20200212_overloading;

// 실행 클래스



public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading_01 ol = new Overloading_01();
		Overloading_02 ol2 = new Overloading_02();
		
		// 출력은 설계 클래스에서 해주기에 메소드 이름만 불러온다
		ol.display();
		
		// 메소드 오버로딩을 통해 값을 넣어서 출력하기.
		ol.display(135, 230);
		ol.display(125, 235);
		
		System.out.println();
		// 방법 1
		System.out.println(ol2.getLength(12345));
		// 방법 2
		int num = ol2.getLength(1234);
		System.out.println(num);
		
		System.out.println();
		System.out.println("--- 형 변환 ---");
		// int 형
		System.out.println(ol2.getLength(123));
		// boolean 형
		System.out.println(ol2.getLength(true));
		// double 형
		System.out.println(ol2.getLength(12.34));
		
		
	}
}