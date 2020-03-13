package kh20200313.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01 {
	public static void main(String[] args) {

		InputStream is;
		is = System.in;
		
		try {
			System.out.print("Input : ");
			int in = is.read();
			
			System.out.println("ASCII : " +  in );
			
			System.out.println("¹®ÀÚ : " + (char) in);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
}