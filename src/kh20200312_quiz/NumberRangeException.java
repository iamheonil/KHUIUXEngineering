package kh20200312_quiz;

public class NumberRangeException extends Exception {
	
	@Override
	public String getMessage() {
		return "1부터 100사이의 숫자가 아닙니다.";
	}

}
