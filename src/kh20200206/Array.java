package kh20200206;

public class Array {
	public static void main(String[] args) {

		// Array, �迭
		// ���� ������ Ÿ���� ������ �ϳ��� �������� ����ϴ°�.
		// �������� ������ �ѹ��� ������ �� �ִ�.
		// �����ϴ� �������� �۸� ����� �����ش�.
		// ���� �����ڵ带 ������ ������� �ʾƵ� �ȴ�.

		// ������ ������
		// '�ڷ���' '�̸�' = �� ����;
		// int num = 0;

		// �̹��� ���� Array ��
		// �ڷ���[] ������;
		// int[] arr;
		// int[] -> ��Ʈ�迭 �̶�� ����Ѵ�.

		// ������ ������ �ٸ� ��
		// �⺻ ������ Ÿ��
		// ������, ������� ���� �ٸ���.

		// �迭 ���� �� �������� ����(�迭)�� ���������.
		// �迭�� �����ϸ鼭 ���������� ������ ���Ѵ�.

		// �迭�� ����
		// �迭 ������ �������� ������ �� �ִ� ���� ����

		// ������Ÿ��[] ������ // ��õ
		// ������Ÿ�� ������[] // ����õ

		// �迭�� ����
		// ���� �����Ͱ� ����� �� �ִ� ����(���, Element)�� �����Ѵ�.
		// ������Ÿ��[����] ������
		// ������ ���� -> ���ڷ� ������ �����!

		// �迭 ����
		// �ڷ���[��������] �迭��;
		int[] arr;
		String[] Sarr;
		int[] asmr;

		// ������ ����
		// int�� �迭 �����Ѵ�(5���� int�� ����)
		arr = new int[5];
		Sarr = new String[2];
		asmr = new int[5];

		/*
		 * arr = 10 20 30 40 50 [0] [1] [2] [3] [4] // [0] [1] ... [n] �� ���(Elemnet) ���
		 * �Ѵ�.
		 */

		// �迭�� ��� ����
		// �迭�� �ε���([0])�� �̿��Ͽ� �ش� ���� ����� ��ҿ� ���� �����ϴ�.
		// �ε����� 0���� �����ϰ� 1�� �����ϸ鼭 �����ȴ�.

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// 5 at kh20200206.Array.main(Array.java:41)
		// ���� ���� ���� �ε����� ����ϸ� �Է��� �ε����� ���� ���°�ٿ��� ������ �߻��ߴ��� �˷��ش�.

		// �迭�� �����ϱ�.
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		Sarr[0] = "�ȳ��ϼ���";
//
//		// System.out.println(arr[0]);
//
//		for (int i = 0; i <= 4; i++) {
//			arr[i] = (i+1) * 100;
//		}
//
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(arr[i]);
//			// arr[i] = i �� int i 0~4���� �þ�ϱ�
//		}
//		
//		System.out.println();
//		System.out.println(arr);			// [I@	2a139a55
//		System.out.println(Sarr);			// [Ljava.lang.String;@	15db9742
//		System.out.println(asmr);			// [I@	6d06d69c
//											// I@ ������ ��.
//									// �迭�� �̸��� �޸𸮿� �迭�� ������ ��ġ(�ּ�, ����)�� ��Ÿ����.

//		int[] arrs = { 10, 20, 30, 40, 50 }; // �迭�� ����� ���ÿ� �ʱ�ȭ!

//		double[] darr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//		boolean[] barr = { true, false };
//		// �迭�� ��� ��� ����ϱ�
//
//		// arrs �� ����ϰ��� �Ѵٸ� 0~4���� 5�� �ݺ� �ؾ��Ѵ�.
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(arrs[i]);
//			}

		int[] tarr = { 1, 2, 3, 4, 5 };
		// ����� ���� : 5��
		// �迭�� ����, ũ��, ��� ��� ���� ���̴�.

//		System.out.println("����� ���� : " + tarr.length);
//												// length �� ����� ���� ���

//		�迭�� ���̸� �̿��� �迭 ��ü ��� 
//		for (int i = 0; i < tarr.length; i++) {
//			System.out.println(tarr[i]);
//		}
		
//		System.out.println();
		
		// �迭�� �ε��� : 0 ~ 5
		// ������ �Է��ϰų� �ε������� ū ���� �Է��ϸ� ArrayIndexOutOfBoundsException �߻�.
		// ������ �Է��ϸ� NegativeArraySizeException �߻�.
		
//		int[] arr2;
//		arr2 = new int[1];
		
		// ���ڿ� String - Char ������ ������ char[] �� ������ ����Ѵ�.
		
		String str = "Apple";
		char[] chArr = {'A', 'p', 'p', 'l', 'e'};
		
//		System.out.println("���ڿ��� ���� : " + str.length());
//		System.out.println("ĳ������ ���� : " + chArr.length);
//		System.out.println("");
//		
//		System.out.println("���ڿ��� ����° ���� : " + str.charAt(3));
//		System.out.println("ĳ������ �ι�° ���� : " + chArr[3]);
		
//		for(int i = 0; i <= 4; i++) {
//			System.out.println(str.charAt(i));
//		}
//		
//		for(int i = 0; i <= 4; i++) { 
//			System.out.println(chArr[i]);
//		}
		
		// String ��  char ���� ����� ���̴� ��Ʈ��������.charAt(�ε�����);
		// 										ĳ���͹迭������[�ε�����];
		//
		
//		String Ÿ���� Char Ÿ������ ��ȯ�ϱ� : toCharArray();
//		char[] converted = str.toCharArray();
		
//		�ݴ�� Char[] �� String ���� ��ȯ�ϱ�
//		String restore = new String(converted);
		
//		String[]
//		String �迭
		
		String[] strArr;
		strArr = new String[3];
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
//		System.out.println("���ڿ� �迭�� ���� : " + strArr.length);
//		System.out.println("�迭�� ù��° ��� : " + strArr[0].length() + " / " + strArr[0]);
//		
//		for (int i = 0; i <= 2; i++) {
//			System.out.println(strArr[i]);
//		}
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].length());
			System.out.println(strArr[i]);
			System.out.println();
		}
		
	}
}
