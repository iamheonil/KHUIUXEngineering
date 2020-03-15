package kh202003.kh20200312_quiz;

public class NumberProcess {

	public boolean checkDouble(int n1, int n2) throws NumberRangeException {

//		if (n1 % n2 == 0) {
//			System.out.println(n1 + "는(은)" + n2 + "의 " + "배수가 맞습니다!");
//			return true;
//		} else if (n1 > 100) {
//			throw new NumberRangeException();
//		} else if (n2 > 100) {
//			throw new NumberRangeException();
//		} else if (n1 < 0) {
//			throw new NumberRangeException();
//		} else {
//			System.out.println(n1 + "는(은)" + n2 + "의 " + "배수가 아닙니다");
//			return false;
//		}

		if (n1 > 100 || n1 <= 0) {
			throw new NumberRangeException();
		} else if (n2 > 100 || n1 <= 0) {
			throw new NumberRangeException();
		} else if (n1 % n2 == 0) {
			System.out.println(n1 + "는(은)" + n2 + "의 " + "배수가 맞습니다.");
			return true;			
		} else if (n1 % n2 != 0){
			System.out.println(n1 + "는(은)" + n2 + "의 " + "배수가 아닙니다");
		}
		return false;		
		
	}
}