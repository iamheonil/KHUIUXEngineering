package kh20200312;

import java.io.IOException;

class ThrowsTest {
	
	public void method() throws IOException {
		throw new IOException();
	
	}
}

public class Exception08_Throws {
	public static void main(String[] args) {

		ThrowsTest tt = new ThrowsTest();
		
		try {
			tt.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

