package kh20200210;

// ��üȭ �ϴ� Ŭ����

public class Main_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_03 c01 = new Class_03();
		Class_03 c02 = new Class_03();
			
//		c01.num = 10;	// ���� �����ڷ� ���� ����� �Ұ����� �ڵ�
		
		c01.setNum(10);				// Setter Method �� 10�̶�� ���� �����Ѵ�.
		int num = c01.getNum();		// Get���� ���� �� ���� �����´�. 
		
		System.out.println(num);
		System.out.println(c01.getNum());
		
		
		
	}
}