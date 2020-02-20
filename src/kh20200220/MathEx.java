package kh20200220;

public class MathEx {
	public static void main(String[] args) {

		// ������ ���
		System.out.println(Math.PI);

		// -10 �� ���밪
		System.out.println(Math.abs(-10));

		// 3.7�� �ø���
		System.out.println(Math.ceil(3.7));

		// 3.7�� ������
		System.out.println(Math.floor(3.7));

		// -3.7�� �ݿø���
		System.out.println(Math.round(-3.7));

		// 2.1�� 3������
		System.out.printf("%.3f", Math.pow(2.1, 3));

		System.out.println("\n");
		System.out.println("�� ū �� : " + Math.max(3.14, 3.141592));
		System.out.println("�� ���� �� : " + Math.min(100, 200));

		int n1 = 11;
		int n2 = 19;
		System.out.println();
		for (int i = Math.min(n1, n2); i < Math.max(n1, n2); i++) {

		}
		// ���� 0.0 (����) ~ 1.0(����) double�� ���� ���� ����
//		System.out.println(Math.random());

		
		// 	Random Number, ����
		//		- �ǻ� ����(�ٸ��� ����, ��¥�� �ƴ�)
		//		- �� �� ���� ��
		//		- Pseudo Random
		//			** Pseudo, ����, ���� : ��¥��, �ٸ���
		//	 		
		// �ǻ� ���� ���� ����
		// 	���ʰ� (Seed)�� ������ ������ ���� ������ �����ϱ� ����� �����.
		// 	������ Seed�� �����ǰų� �̸� ������� �˰� �ִٸ� ����� �����ȴ�.
		//		�ذ�� -> Seed�� ��� �ٲ۴�.
		// 	Seed HardWare Clock���� �̿��Ѵ�.
		// 		HardWare Clock : 1970�� 1�� 1�� 00�ø� �������� ������� �귯�� ��
		// 
		// ������ ���������� ������ ������ ���� ������ Seed�� ����Ѵ�. 
		//
		// public static double Math.random(); �޼ҵ带 �̿��Ͽ� �ǻ糭���� �����Ѵ�.
		// 
		// Random Ŭ������ ����Ѵ�.
		// 
		//
		//
		
		
		System.out.println((int) (Math.random() * 5) + 1);

		// 1. ���� 2. ���� 3. ��
		System.out.println((int) (Math.random() * 3) + 1);
		

	}
}
