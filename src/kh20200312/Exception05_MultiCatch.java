package kh20200312;

public class Exception05_MultiCatch {
	public static void main(String[] args) {

		try {
			
			
		} catch (NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {	// MultiCatch
			System.out.println("���� �߻�.");
			
		} 
		catch (Exception e) {
			
		}
		
	} // Main End
} // Class End