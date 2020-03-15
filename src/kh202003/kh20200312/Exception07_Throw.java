package kh202003.kh20200312;

class ThrowTest {

	public void print(String string, int i) {

		if (string == null) {
			throw new NullPointerException();
//			throw new ArithmeticException();
		}

		for (int y = 0; y < i; y++) {
			System.out.println(string);
		}

	}
}

public class Exception07_Throw {
	public static void main(String[] args) {

		ThrowTest tt = new ThrowTest();

		tt.print("HI", 3); // HI �� 3�� ���.

		try {
			tt.print(null, 3); // NULL 3�� ���.

		} catch (Exception e) {
			System.out.println("���ڿ��� Null");

		}

	} // Main Method End
} // Class End