package kh202001.kh20200131;

import java.util.Scanner;

public class Source4 {
	public static void main(String[] args) {

// ��ĳ��
// Ű������ �Է��� �޾Ƽ� ������ ������ �� �ֵ��� ����� �����ϴ� Ŭ����

		// ���� ����
		int num;

		// �Է� ����� �� ��ü ����
		Scanner input;

		// ������
		input = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		// �Է��� ���ڿ��� ó���ϴ� �޼ҵ�
		String result = input.nextLine();
//		String result2 = input.nextLine();
							// "\n" +  + result2
		System.out.println(result + "\n");
		
		System.out.println("�Ʒ��� nextInt()");
		System.out.println("");
		
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int resultInt = input.nextInt();
		System.out.println(resultInt);
		
// Scanner�� �ֿ� ���(�޼ҵ�)
// nextLine() : ���ڿ� �� ���� �Է¹޾� String Ÿ������ ��ȯ�Ѵ�.
// next() : ���ڿ� �� ���� �Է¹޾� String Ÿ�Է� ��ȯ�Ѵ�. 
// netxInt() : �Է��� ���� �� intŸ���� ã�� intŸ������ ��ȯ�Ѵ�
// nextBoolean() 
// nextByte() 
// nextShort()
// nextLong()
// nextFloat()
// 
// char �� �Է� ���� ���(�޼ҵ�)�� ����.
// nextLine() �� �̿��Ͽ� ���ڿ��� �Է¹޾� char ������ ��ȯ�Ͽ� ���.
// 		
// 		
// 		
// 		
// 		

	}
}