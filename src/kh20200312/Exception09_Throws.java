package kh20200312;

import java.io.IOException;

public class Exception09_Throws {
	public static void main(String[] args) {

		
		System.out.print("Input : ");	
		
		try {
			char input = (char) System.in.read();
			System.out.println("\nPRINT : " + input);
			System.out.println("ASCII : " + (int)input);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		
	}
}