package kh202002.kh20200224;

public class StringBufferEx {
	
	public static void info(StringBuffer s) {
		
		System.out.println("length : " + s.length());
		System.out.println("Capacity : " + s.capacity());
		
	}
	
	public static void syso(StringBuffer s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		System.out.println("String Buffer ������ ȣ��");
		
		// ��ü ������ ����� ��� �����ϴ�.
		StringBuffer sb = new StringBuffer();
		
		// ���ڿ��� ����
		System.out.println("length : " + sb.length());
		
		// ���ڿ��� Capacity(���� �ɷ�, ä������ �� �ִ� �Ѱ�, ���Ķ�� �θ��⵵ �Ѵ�.)
		System.out.println("��������");
		System.out.println("Capacity : " + sb.capacity());
		
		// '\' ������� ��� 
		System.out.println("\nString Buffer(\"Hello\") ȣ��");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2);
		
//		System.out.println("length : " + sb2.length());
//		System.out.println("Capacity : " + sb2.capacity());
		info(sb2);
		
		System.out.println("\nStringBuffer(int) ȣ��");
		StringBuffer sb3 = new StringBuffer(5);
		info(sb3);

		System.out.println("\nApple �߰��ϱ�");
//		StringBuffer sb3 = new StringBuffer("Apple"); ������ ���
	
		sb3.append("Apple");
		
		System.out.println(sb3);
		info(sb3);
		
		sb3.append("Banana");
		
		System.out.println("\n���ڿ� �߰� ��\n" + sb3);
		info(sb3);
		
		System.out.println("\n == ���� == \n");
		sb3.insert(5, "Orange");
		System.out.println(sb3);
		
		sb3.deleteCharAt(3);
		syso(sb3);
		
		System.out.println("\nsubstring");
		String sub = sb3.substring(1, 7);
		syso(sb3);
		System.out.println(sub);
	
		System.out.println("trim ������");
		info(sb3);
		
		System.out.println("\ntrimtoSize");
		sb3.trimToSize();
		info(sb3);
		
		System.out.println("\nReverse");
		sb3.reverse();
		syso(sb3);
		
	
	}
}