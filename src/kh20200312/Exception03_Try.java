package kh20200312;

public class Exception03_Try {
	public static void main(String[] args) {

		System.out.println("\n���Ϲ� �����\n");

		int[] arr = new int[5];
		int i = 0;

		try {
			while (true) { // ���ѷ���
				arr[i] = i + 1;

				System.out.println(arr[i]);
				System.out.println(i + "��° �Ϸ�");

				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) { // Exception ���� try catch �� ����� ���������� ���� �����ϰ� Exception ���� ���ش�.
			// TODO: handle exception
			System.out.println("!! ���� �߻� !!");
			
			e.printStackTrace();	// ������ ������ ���
		}

		System.out.println("\n���α׷��� ���������� ����Ǿ����ϴ�.");
	
	}
}