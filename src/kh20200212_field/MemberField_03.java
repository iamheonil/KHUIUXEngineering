package kh20200212_field;

// ���� Ŭ����



public class MemberField_03 {
	
	private int num = 777;
	private static int num2 = 555;
	
	public void method(int var) { // var -> �Ű�����, ��������
		int num = 101;		// ��������
		int num2 = 202;		// ��������
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(this.num);
//		System.out.println(this.num2);
		System.out.println(MemberField_03.num2);
		
		
	}
}
