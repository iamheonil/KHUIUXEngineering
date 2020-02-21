package kh20200221_wrapper;

public class WrapperEx {
	public static void main(String[] args) {

	// �ڽ�, Boxing
		// Wrapper : ������
		// �⺻ ������Ÿ�� -> ��üȭ
		// ** �⺻ ������Ÿ���� �����͸� ��üȭ�Ͽ� ����� �� �ְ� ���ִ� Ŭ������ **

		// �⺻�� Ÿ�� �����͸� ������ ������ ����� �� �ְ� �ȴ�.
		// Boolean
		// Character
		// Byte, Short, Integer, Long
		// Float, Double
		
	// ��ڽ�, Unboxing
		// Wrapper Ŭ���� -> �⺻ ������Ÿ�� ��ȯ
		// Wrapper Ŭ������ �޼ҵ带 �̿��Ѵ�.
		// int i2 = iVal2.intValue(); // Integer ���� int Ÿ������ ��ȯ���ִ� �ڵ�
		
	// ���� �ڽ�, ���� ��ڽ�
		// �ڽ�, ��ڽ��� �ڵ����� �̷������ ����
		// �⺻ ������Ÿ�԰� ������(Wrapper)�� ���� �������� �ʰ� ����� �� �ִ�.
		// ex)
		// Integer iVal = new Integer(123);
		// int num = 456;
		// int sum = iVal + num; // �������� �۵��Ѵ�.
	
	// �Ľ�
		// ���ڿ����� �����͸� �����ϴ� ���
		// Wrapper Ŭ������ �����޼ҵ�� ������ parseXXX() �޼ҵ带 �̿��Ѵ�.
		// �� ������Ÿ�Կ� �´� ������ ���ڿ����� �ش� ������Ÿ������ �����Ѵ�.
		// ex)
		// String str = "1234";
		// int num = Integer.parseInt(str);
		// double d = Double.parseInt("3.14");
		// ** Character ���� �Ľ� �޼ҵ尡 �������� �ʴ´�.
		// ** ��� "���ڿ�".charAt(idx) �� ����Ѵ�.
		// ** Boolean���� "true"�� ����� �Ľ��ϰ� ������ ���ڿ��� ������ false�� ��ȯ.
		
		
		int i1 = 10;

		Integer iVal1 = new Integer(100);

//		System.out.println(i1);
//		System.out.println(iVal1);

		Byte bVal = new Byte((byte) 1);
		Short sVal;
		Long lVal;
		Float fVal;
		double dVal;
		Character cVal;
		boolean boolVal;

//		System.out.println(bVal);

		Integer iVal2 = new Integer(i1); // �ڽ�
		Integer iVal3 = new Integer("123");

		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);

		System.out.println();

		double d1 = 123.456;

		Double dVal1 = new Double(d1); // ���ڽ�
		Double dVal2 = new Double("46.789"); // ���ڽ�

		System.out.println(d1);
		System.out.println(dVal1);
		System.out.println(dVal2);
		System.out.println();

		String str = "1234"; // ���ڿ�

		int num1 = Integer.parseInt(str);
//		**	parse : �����ϴ�.

		System.out.println(num1);

//		int num2 = Integer.parseInt("1234ABC");
//		NumberFormatException

		int num3 = Integer.parseInt("-1234");
		System.out.println(num3);

		double num4 = Double.parseDouble("3.14");
		System.out.println(num4);

		double num5 = Double.parseDouble("12345");
		System.out.println(num5);

		System.out.println();

		// boolean �� true �̿ܿ� �ٸ� ���� ���� ������ false ����Ѵ�.
		String data = "true"; // true
//		String data = "t1231132";	// false
//		String data = "qeweqwwqe";	// false

		boolean b1 = Boolean.parseBoolean(data);

		System.out.println(b1);

		System.out.println();

		// ���ڿ����� ���Ϲ��� �����͸� �и��� ���� charAt(index) �޼ҵ带 ����Ѵ�.
		String data2 = "Apple";
		char ch = data2.charAt(0);
		System.out.println(ch);

		System.out.println();

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

		System.out.println();

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println();

		
		
//		Integer iValT = new Integer(100);
//		int iValT = 12345;
//		intValue(iValT); ??? �̰� ���� �� �´µ�
		
		int i2 = iVal2.intValue(); // Integer ���� int Ÿ������ ��ȯ���ִ� �ڵ�

		// UnBoxing �����, �������� �⺻��Ÿ������ �ٲٱ�
		System.out.println(iVal2);
		System.out.println(i2);

		System.out.println();

		double d2 = dVal2.doubleValue();
//		double d2 = dVal2.intValue();
//		double d2 = dVal2.longValue();
		System.out.println(d2);

		System.out.println();
//		Integer iVal5 = new Integer(20);
		Integer iVal5 = 20; // ����ڽ�

		System.out.println(iVal5);

	}
}