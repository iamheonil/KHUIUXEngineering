package kh202003.kh20200312;

public class Exception01_Basic {
	public static void main(String[] args) {

		// IndexOutOfBoundsException
		int[] arr = new int[5];
		System.out.println(arr[4]);
//		System.out.println(arr[5]);

		// NullPointerException
		int[] arr2 = new int[5];
		System.out.println(arr2[4]);
		arr2 = null;
//		System.out.println(arr2[6]);

		System.out.println("\n���Ϲ� �����\n");
		int i = 0;
//		while(true) {	// ���ѷ���
//			arr[i] = i + 1;
//		
//		System.out.println(arr[i]);
//		System.out.println(i + "��° �Ϸ�");
//		
//		i++;
//		
//		}

		while (true) { // ���ѷ����� �ذ�

			if (i < 0 || i >= arr.length) {	// �������� ����� ����ó��, ���ݵ� ����ϱ� �Ѵ�.
				System.out.println("\n�ε����� " + arr.length + "���� �۾ƾ� �մϴ�.");
				
				break;
			}

			arr[i] = i + 1;
			System.out.println(arr[i]);
			System.out.println(i + 1 + "��° �Ϸ�");

			i++;

		}
		
		System.out.println("\n���α׷��� ���������� ����Ǿ����ϴ�.");

	}
}