package kh202002.kh20200212_field;

// ���� Ŭ����



public class MemberField_02 {
	// ������������ ����� �� ���� �޸�
	// ��� �ʵ�

	
	// Static Ű����, ���� Ű����
	// Ŭ������ ����� �ν��Ͻ�ȭ(��ü����) ���� ����� �� �ְ� ����� Ű����.
	// ����ʵ�, ����޼ҵ� ��ο��� ���� �����ϴ�.
	// ��ü(�ν��Ͻ�)�� ��� ���� �����ϸ� Ŭ���� ������ ����ȴ�.
	// Ŭ�������� ���� �����Ѵ�.
	// ������ ����(���α׷� ���� ����)�� ����� �� �ִ� �غ� �Ϸ�ȴ�.
	// ��� �ʵ�� Ŭ���� ������ ���� ������ �����Ѵ�.
	// ��� �޼ҵ�� ������ �� �ִ� �غ� �Ϸ�ȴ�.(���ε�)
	
//	** �����޼ҵ忡�� �ν��Ͻ� ������ ����� �� ����. 
//	** �����޼ҵ忡�� ���������� ����ؾ��Ѵ�.
	
//	** �Ϲݸ޼ҵ忡���� �� �� ��� �����ϴ�.
//	** main() �޼ҵ�� static �޼ҵ��̴�.
	
	
	// Ŭ���� ����, ��������, Static ����
	public static String city = "Seoul";
	
	//	private static String city = "Seoul";
	
	// ���� �޼ҵ�, ����ƽ�޼ҵ�
	public static String getCity() {
		return city;
	}
	
//	private int num;
//	
//	public static void test() {
//		
//		System.out.println(num);
//	}
	
	// static �� ����, �� �޸� �������� ����� ó�� �Ǿ
	// �����޼ҵ忡�� �ν��Ͻ� ����� �Ұ����ϴ�.
	

	private static int num2;

	public void test2() {
		System.out.println(num2);
	}

	private static int num3;

	public static void test3() {
		System.out.println(num3);
	}
	
}