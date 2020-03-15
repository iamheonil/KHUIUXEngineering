package kh202003.kh20200312;

public class OddNumberException extends Exception {

	@Override
	public String getMessage() {
		return "홀수는 안됩니다!";
	}
	
	
}
