package kh20200212_field;

// ���� Ŭ����



public class MemberFieldEx {
	public static void main(String[] args) {
		// new �� ����� �� HEAP(��) �޸�
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null; // Null Pointer
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();
		
		mf01.setNum(100);
		mf02.setNum(200);

//		mf01.setName(name);
		mf02.setName("��");
		
//		mf03.setNum(300);
		// NullPointerException - ��������� ���� �� ��µȴٸ�
		// �ش� �ڵ�� ���� �������� '.'�� ������ �������� �Ǿ��ֳ� Ȯ���� ��.
		
//		System.out.println(mf01.getNum());
//		System.out.println(mf02.getNum());
//		System.out.println(mf01.getName());
//		System.out.println(mf02.getName());
//		
//		System.out.println();
		
		
//		System.out.println(mf04.city);
//		System.out.println(mf05.city);
//		System.out.println();
//		
//		mf04.city = "BuSaN";
//		System.out.println(mf04.city);
//		System.out.println(mf05.city);
//
//		System.out.println();
//		mf05.city = "JeJu";
//		System.out.println(mf05.city);
//
//		System.out.println(MemberField_02.getCity());
		
		// ���� Ŭ�������� �������� 
		// Final �� ���� �ϰ� ����ϰ� �Ǹ� ���� ���� �Ұ����ϴ�.
		// Static ���� ���� �ϰ� ����ϰ� �Ǹ� ���� �� �������� ��� ä������.
		
		MemberField_03 mf06 = new MemberField_03();
			
		
	}
}