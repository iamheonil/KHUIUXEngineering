package kh20200312;

public class Exception06_Throws {
	public static void main(String[] args) {

		Exception e = new NullPointerException(); // 예외 객체 생성
//		 Exception 은 Checked

//		NullPointerException e = new NullPointerException();	// 예외 객체 생성
		// NullPointer 는 Un Checked이기 때문에 위의 소스는 작동하지 않는다.
		// 다만 try catch 문으로 감싸주면 실행 가능하다.

//		throw e;

		try {
			throw e;
			
		} catch (Exception e2) {
			e2.printStackTrace();
			
		}

//		 throw new NullPointerException();
		
	}
}