package kh20200312;

class ThrowTest {

	public void print(String string, int i) {
		
		for(int y = 0; y < i; y++) {
			System.out.println(string);
		}
		
	}
}

public class Exception07_Throws {
	public static void main(String[] args) {

		ThrowTest tt = new ThrowTest();

		tt.print("HI", 3);	// HI 를 3번 출력.
		
		
	}
}