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
		// ���� - 0 : int num = 0; double d = 0.0;
		// ���� - 0 : char ch1 = '\0', char ch2 = 0;		���ڿ��� ���� ��Ÿ����.
		// ������ - 0 : NullPointer = String str = null;	��������� ������ ��Ÿ����.
		
	
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