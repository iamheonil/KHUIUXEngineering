package kh202002.kh20200221_string;

public class StringEx {
	public static void main(String[] args) {

		String str1 = "Apple"; // ���ڿ� ���ͷ� ���
		String str2 = new String("BaNaNa"); // ���ڿ� ��ü

//		System.out.println(str1);
//		System.out.println(str2);

		System.out.println("length");
		System.out.println(str1.length());
		System.out.println(str2.length());

		System.out.println("Cherry�� ���� : " + "Cherry".length() + "\n");

		System.out.println("Equals");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("Apple.equals(str1) : " + "Apple".equals(str1));

		// ���� �� �ִ� �ڵ�
		System.out.println("Apple==str1 : " + ("Apple" == str1));
		// ** ���ڿ��� ���� ���� == �������� equals() �޼ҵ带 ����Ѵ�.

		String test = null;

//		if (test.equals("Durian")) {
//			System.out.println("����");
//		}
		
		if ("Durian".equals(test)) {
			System.out.println("����");
		} else {
			System.out.println("��r����");
		}

		String temp = "";
		
		
	}
}
