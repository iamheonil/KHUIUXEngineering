package kh202003.kh20200312;

public class Exception04_Try {
	public static void main(String[] args) {

		try {
			// try 블록
			// 예외가 발생하는 코드
			
		} catch (ArithmeticException e) {
			// ArithmeticException 상황시 동작하는 예외처리 코드
			
		} catch (NullPointerException e) {
			// NullPointerException 상황시 동작하는 예외처리 코드
			
		} catch (Exception e) {
			// 위의 적어놓은 예외를 제외한 나머지 상황에 동작하는 예외처리 코드
		
		} finally {
			// 생략 가능한 Finally 코드
			// 예외가 발생해도, 하지 않아도 수행하는 코드
		    // 주로 Checked Exception 에서 사용하는 경우가 많다.
		    // 자원해제할 때 사용하는 코드.
			
		}
		
		
	} // Main End
} // Class End