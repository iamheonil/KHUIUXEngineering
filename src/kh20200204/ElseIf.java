package kh20200204;

public class ElseIf {
	public static void main(String[] args) {

		// if�� else if, else ���� ����ϴ� ����� ���Ͽ�
		// if -> else if -> else ������ �����ϸ�
		// false -> false - > print ������ �����Ѵ�.
		
		int num = 7;
		
		if (num > 0 ) { // ���
			System.out.println("����Դϴ�.");
		} else if ( num < 0 ) { // ����
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
		
	
	}
}
