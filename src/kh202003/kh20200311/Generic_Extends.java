package kh202003.kh20200311;

public class Generic_Extends {
	public static void main(String[] args) {

		print(123);
		print(123.456);
		
//		print("String");
		
	}
	
	public static <T extends Number> void print(T t) {
		System.out.println(t);
	
	}
}