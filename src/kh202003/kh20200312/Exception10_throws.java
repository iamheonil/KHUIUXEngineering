package kh202003.kh20200312;

import java.io.IOException;

class ThrowsEx {
	public char readChar() throws IOException {
		return (char) System.in.read();
		
	}
}

public class Exception10_throws {
	public static void main(String[] args) {

		ThrowsEx te = new ThrowsEx();
		
		char ch = '\0';
		// 숫자 - 0 : int num = 0; double d = 0.0;
		// 문자 - 0 : char ch1 = '\0', char ch2 = 0;		문자열의 끝을 나타낸다.
		// 참조값 - 0 : NullPointer = String str = null;	참조대상이 없음을 나타낸다.
		
	
		try {
			System.out.print("Input Char : ");
			ch = te.readChar();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Input result : " + ch);
		
	}
}