package kh202002.kh20200212_overloading;

// ���� Ŭ����



public class Overloading_02 {

	// int �� ���������� ���ڼ�(����)�� ���ؼ� ��ȯ
	// 111222333 -> 9��
	// 1234 	 -> 4��
	// 	�������� // ��ȯ��
	//	
	
	public int getLength(int num) {
		
		// 1. �Է� �� int -> String ����ȯ
		String str = String.valueOf(num);
		
		// 2. ��ȯ�� ���ڿ��� ���̸� return
		int result = str.length();
		
		return result;
	} 
	
	public int getLength(boolean type) {
		
		// 1. �Է� �� boolean(true, false) -> String ����ȯ
		String str = String.valueOf(type);
		
		// 2. ��ȯ�� ���ڿ��� ���̸� return
		int result = str.length();
		
		return result;
	}
	
	public int getLength(double num) {
		
		// 1. �Է� �� double -> String ����ȯ
		String str = String.valueOf(num);
		
		// 2. ��ȯ�� ���ڿ��� ���̸� return
		int result = str.length();
		
		return result;
	} 
	
}
