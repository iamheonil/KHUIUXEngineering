package kh202001.kh20200131;

public class Source3 {
	public static void main(String[] args) {
		
// ���׿����� - ��ȣ
// +, -
// 
		
	int num = -7;
	System.out.println(-num);
	System.out.println(-(-7));
	System.out.println(+num);
	
	System.out.println("");
	
	System.out.println(+num);
	System.out.println(+(-7));
	System.out.println(-7);
	System.out.println("");
	
// '!' : �� ���� ������
// (type) : ����ȯ ������
// '.' : ���� ������ (System'.'out'.'println)
//
	
// ���׿����� - ����
// ++, --
// ����������, ���ҿ����� = �ձ��ڸ� �� ���������ڶ�� �Ѵ�.
// 
// �ǿ����ڷ� ����� ������ ���� 1 ����, ���ҽ�Ų��.
// ex) i++
	
	System.out.println("");
	int i;
	i = 15;
	System.out.println(i);
	System.out.println(i--); // ����, ��ġ ������, i(15)�� �ҷ��� �� ������ �����Ѵ�.
	System.out.println(i);	 // 15, 15, 14
	System.out.println("");
	i = 15;
	System.out.println(i);
	System.out.println(--i); // ����, ��ġ ������, i(15)�� �ҷ����� �� ������ ����(14)�Ѵ�.
	System.out.println(i);	 // 15, 14, 14
	System.out.println("");
	i = 15;
	System.out.println(i++ * 3);
	System.out.println(i);
	System.out.println(i * 3);
	System.out.println("");
	
// ���׿����� - ����
// �������ǿ�����
// ���׿�����
// ���ǿ�����
	
// ** ���ǽ� : ������ ����� true / false �� �Ǻ��� �� �ִ� �����
// ���ǽ� ? ���϶� ��ȯ �� : ������ �� ��ȯ ��
	int jo1 = 10, jo2 = 20;
	System.out.println(jo1 > jo2 ? "jo1 �� ũ��" : "jo1 �� ũ���ʴ�.");
	
	int result;
	result = jo1 > jo2 ? jo1 : jo2;
	System.out.println(result);
	
// ���� ���ǽ��� �� ���� if ������ ��ü�Ѵ�.
	
// 
// 
// 
// 
// 	
	
	}
}