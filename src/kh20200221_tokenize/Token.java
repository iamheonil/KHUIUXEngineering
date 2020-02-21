package kh20200221_tokenize;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {

		// String.split() �޼ҵ�

		String data1 = "Hi Hello Hola";
		// " " �����ڷ� �����Ͽ� data1 ���ڿ��� ���ȭ�Ѵ�.
		//
		//

		String[] tokens = data1.split(" ");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

		System.out.println("\n");

		// ���Ϲ��ڰ� �ƴ� �����ڵ� ����� �� �ִ�.
		String data2 = "i%!am%!iron%!man";

		String[] token2 = data2.split("%!");
		for (int i = 0; i < token2.length; i++) {
			System.out.println(token2[i]);
		}

		System.out.println("\n");

		// [%! ] �ǹ̴� "%", "!", " " �� �ϳ��� �����ϸ� true
		// OR�� ����ϴ�.
		String data3 = "I%am!iron man";
		String[] token3 = data3.split("[%! ]");

		for (int i = 0; i < token3.length; i++) {
			System.out.println(token3[i]);
		}

		System.out.println("====================================================================");
		// StringTokenizer Ŭ����

		// ������ StringTokenizer(���ڿ�, ������)
		StringTokenizer st1 = new StringTokenizer(data1, " ");

		System.out.println("��ū �� : " + st1.countTokens());

		while (st1.hasMoreTokens()) { // hasMoreTokens �� boolean �����̶� ���Ϲ��� �־ ����.
										// ���� ������ ��ū�� �ľ��ϰ� true, false �� ��ȯ�ϱ� ������
										// ���� ��ū�� ���� false �� ��ȯ�ϴ� ���ÿ� �ݺ��� ����.

			System.out.println("���� : " + st1.nextToken());
		}

		// StringTokenizer �� �ֿ� �޼ҵ�
		// public int countTokens() -> nextToken()�� ����� �� �ִ� Ƚ���� ��ȯ�Ѵ�.
		// nextToken()�� ȣ���ϸ� ��ȯ�Ǵ� ���� �پ���.

		// public boolean hasMoreTokens() -> nextToken()�� ���� ������ �� boolean ���� ��ȯ���ش�.
		// ���� ��ū�� ������ true, ������ false�� ��ȯ�Ѵ�.

		// public String nextToken() -> ���� ��ū�� ��ȯ�Ѵ�.
		// !

		System.out.println();
		
		StringTokenizer st2 = new StringTokenizer(data2, "%!");

		for (int i = 0; i < 4; i++) {
		}

		System.out.println("��ū ���� : " + st2.nextToken());
		System.out.println("��ū ���� : " + st2.nextToken("%")); // ������ ���� �� ����
		System.out.println("��ū ���� : " + st2.nextToken());
		System.out.println("��ū ���� : " + st2.nextToken());

		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer(data3, "%! ");
//		StringTokenizer st3 = new StringTokenizer(data3, "[%! ]"); ���� ǥ������ �˰� �ִٸ� �� ����� �� ����.
		
		while (st3.hasMoreTokens()) {
			System.out.println("��ū ���� : " + st3.nextToken());
		}
		
	}
}