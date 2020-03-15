package kh202003.kh20200312;

public class CheckEven {

	// 전달 인자 짝수, 홀수 판별하는 기능
	public void check(int num) throws OddNumberException {

		if (num % 2 == 0) {
			System.out.println("짝수가 맞습니다.");
		} else {
			throw new OddNumberException();
		}

	}
}