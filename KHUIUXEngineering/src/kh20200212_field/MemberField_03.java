package kh20200212_field;

// 설계 클래스



public class MemberField_03 {
	
	private int num = 777;
	private static int num2 = 555;
	
	public void method(int var) { // var -> 매개변수, 지역변수
		int num = 101;		// 지역변수
		int num2 = 202;		// 지역변수
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(this.num);
//		System.out.println(this.num2);
		System.out.println(MemberField_03.num2);
		
		
	}
}
