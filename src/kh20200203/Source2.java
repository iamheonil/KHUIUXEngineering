package kh20200203;

import java.util.Scanner;

public class Source2 {
	public static void main(String[] args) {

//		���ڿ� �Է� ó�� �޼ҵ�
//		nextLine(), next();
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
//		���ڿ� �Է� �޾� Str1 ����ϱ�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		str1 = sc.nextLine();
		System.out.print("�Է��Ͻ� Str1 �� : " + str1 + "\n");
//		���ڿ� �Է� �޾� Str2 ����ϱ�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		str2 = sc.next();
		System.out.print("�Է��Ͻ� Str2 �� : " + str2 + "\r");
		System.out.println("��");
		
//		nextLine() �� next() �� �������� ���� �����ε�
//		nextLine() : ����Ű�� �������� ���ڿ��� �����Ѵ�. (���� �ٶ� ���ٻ� �� "���� �ٶ� ���ٻ�"�� ���) 
//		next() : ���鹮�ڸ� �������� ���ڿ��� �����Ѵ�. (���� �ٶ� ���ٻ縦 "����" "�ٶ�" "���ٻ�"�� ����Ѵ�.
//		���⸦ ������ ������ �Է� �������� nextLine()�� ����. ��������� nextLine()�� ���� ����.

//		����(���鹮��)��? // White Space Character
//		����, �ٹٲ�, ��, ����Ű
//		���� : ' ', (ASCII 32�� - ����)
//		����(�ٹٲ� - ����Ű) : '\n', (ASCII 10��)
//		��, ������ : '\t', (ASCII 9��)
		
//		������ �ü���� ���� \r, \n �� ����ϰ� ���� ����� �޶�����
//		\r : CR, carraige Return  	 / ����Ű�� ������ ó���κ�(<-) ���� �����ִ°�
//		\n : LF, Line Feed, New line / Ÿ�ڱ�� ���� ��� ó���κ����� ����� �ʰ� �� �� �Ʒ��� ���� �����ش�.
//		������� CR, LF ���� ��� �Ѵ�.
//		�������� \n �� ����Ѵ�.
//		Mac OS�� \n �� ����Ѵ�.

		
	}
}
