package kh20200312;

public class Exception12_CustomException {
	public static void main(String[] args) {

		// ¦������ �Ǻ��ϴ� ��ü �����

		CheckEven ce = new CheckEven();

		try {
			ce.check(13);
		} catch (OddNumberException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			ce.check(14);
		} catch (OddNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ���� ó��, Exception Ȧ�� �ȵ� ���

//		ce.check(14); // ���� ��Ȳ, sysout ¦�� �´� ���

	}
}