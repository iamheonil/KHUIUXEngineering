package kh202002.kh20200203;

import java.util.Scanner;

public class Source3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" -- �Է� -- ");
		System.out.print("���ڸ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.print("���ڸ� �Է� : ");
		sc.nextLine(); // ������ �����ִ� '\n'�� �����ش�.
//		���� nextInt�� ����ϰ� �Ǹ� �Ʒ��� sc.nextLine() �� ������ �Ǵµ� �̰��� �����ϰ��� �ٷ����� sc.nextLine() �� ������ش�.
//		* �ΰ�����
//		nextLine() �޼ҵ带 ����ϱ� ���� nextLine() �̿��� ��� next() �迭 �޼ҵ带 ����� ���� �ִٸ� nextLine() ������ nextLine()�� �ѹ� �� �����ؾ��Ѵ�.
		String str = sc.nextLine();
		
		System.out.println(" -- ��� -- ");
		System.out.println(num);
		System.out.println(str);
		
	}
}