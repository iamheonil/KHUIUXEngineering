package kh202003.kh20200312;

public class CheckEven {

	// ���� ���� ¦��, Ȧ�� �Ǻ��ϴ� ���
	public void check(int num) throws OddNumberException {

		if (num % 2 == 0) {
			System.out.println("¦���� �½��ϴ�.");
		} else {
			throw new OddNumberException();
		}

	}
}