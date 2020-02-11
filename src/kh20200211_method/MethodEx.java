package kh20200211_method;

import java.util.Arrays;

// Ex �� exe -> ��������

public class MethodEx {
	public static void main(String[] args) {

		// 1. ���Ŭ������ ���� �������ش�. Method_01 m01 = new Method_01();
		// 2. ������ ����� �ҷ��´�. m01.add(int1, int2);
		// 3. �ҷ� �� ����� ���� �����ϰ� ����Ѵ�.

		Method_01 m01 = new Method_01();
		Method_02 m02 = new Method_02();

		int res = m01.add(100, 200);

		System.out.println("���� �� �� : " + res);
		System.out.println("����Ʈ���� �ٷ� ����ϴ� ��� : " + m01.add(150, 100));
		System.out.println();

		System.out.println("========== 02�� ==========");
		m02.method01();
		m02.method02(1); // ��������, �����μ�, argument
							// �ٿ��� ����, �μ� ��� �ϱ⵵ �Ѵ�.

		m02.printNum2(34, 70);
		System.out.println(m02.returnNum());
		System.out.println(m02.add(1230, 2027));

		System.out.println();
		System.out.println("========== 03�� ==========");

		Method_03 m03 = new Method_03();

		int[] arr = new int[5];
		int num;

		arr[2] = 100;
		num = 200;

		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println(Arrays.toString(arr));
		// Arrays.toString(�迭��) -> �迭���� �� �ִ� ������ String ���� �ٲپ� ������ش�.
		// Arrays.Sort -> ����
		// Arrays.fill(�迭��, ��); -> �迭���� ������ �� ä���ش�.
		System.out.println(num);

		m03.arrTest01(arr); // ����, Reference ����
		m03.arrTest02(num); // �� Value ����

		// Call By Value, ���� ���� ȣ��
		// �޼ҵ带 ȣ���� �� ���޵Ǵ� ���ڰ� �⺻������Ÿ���� ��
		// ȣ��� �޼ҵ� (Callee)���� �Ű������� ���� �����ϴ��� ȣ����(Caller) �޼ҵ忡���� ���� ������� �ʴ´�.

		// Call By Reference, ������ ���� ȣ��
		// �޼ҵ带 ȣ���� �� ���޵Ǵ� ���ڰ� �������� ��
		// ȣ��� �޼ҵ� (Callee)���� �Ű������� ���� �����ϸ� ȣ����(Caller) �޼ҵ�� ���� ����ȴ�.
		
		// Call By Address : Pointer						]	�ΰ��� ��������
		// Call By Name : �⺻���̳� �������̳� ���о���	] 	�ʴ´�.
		
		System.out.println();
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
		// Arrays �� ���� �Ǿ��� num �� ������� �ʾҴ�.
		// �迭�� �ٲ�� �⺻�� �����ʹ� �� �ٲ��� �ʾҳ�?

		// �����Ҵ��� �ϴ��� �����Ҵ��� �ϴ��Ŀ� ���� ���ÿ�, ���� ��ġ�ȴ�.
		// int[] arr ���� �Ҵ�, ���ÿ� ���������
		// new int[5]; �� ���� �Ҵ�. ���� ����� ����.

		/*
		 * ���� | ��
		 * 
		 */
		
		System.out.println("========== 04�� ==========");
		
		int n = m03.arrTest03();
		n = 20;
		
		int[] ar = m03.arrTest04();
		ar[0] = 99;
		
		System.out.println(n);
		System.out.println(ar[0]);

		
	}
}