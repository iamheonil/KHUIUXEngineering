package kh20200204;

public class ElseIf {
	public static void main(String[] args) {

		// if와 else if, else 까지 사용하는 방법에 대하여
		// if -> else if -> else 순으로 진행하며
		// false -> false - > print 순으로 진행한다.
		
		int num = 7;
		
		if (num > 0 ) { // 양수
			System.out.println("양수입니다.");
		} else if ( num < 0 ) { // 음수
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
	
	}
}
