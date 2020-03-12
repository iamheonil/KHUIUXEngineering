package kh20200312;

public class Exception03_Try {
	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 0;
		
		
		// 고전적인 예외처리 방법
		if( num2 != 0 ) {	// num2 가 0이 아니라면!
			System.out.println(num1 / num2);
		} else {	// num2 가 0이라면 예외
			System.out.println("나눔수가 0이므로 예외");
		}
		
		// try - catch 문
		try {
			System.out.println(num1 / num2);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); // 예외정보 확인.
			System.out.println("나눔수가 0이므로 예외");
		}
		
		System.out.println("시스템 정상 종료");
		
	}
}