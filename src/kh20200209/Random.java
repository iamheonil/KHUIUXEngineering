package kh20200209;

public class Random {
	public static void main(String[] args) {

		int num = 45;

		int[] randomArr = new int[6];

		System.out.println("");
		System.out.println("");
		System.out.print("\t1~45 ���� ������ ���� �̾Ƴ��ϴ�. : ");
		for (int i = 0; i < randomArr.length; i++) {

			randomArr[i] = (int) (Math.random() * 45);

			System.out.print(randomArr[i] + " ");

		}
	}
}
