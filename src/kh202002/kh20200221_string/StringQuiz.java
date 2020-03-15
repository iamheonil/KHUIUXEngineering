package kh202002.kh20200221_string;

public class StringQuiz {
	public static void main(String[] args) {

		System.out.println("\n---toLowerCase()-------");
		// str1 ���ڿ��� ��� �ҹ��ڷ� ��ȯ�Ͽ� ����
		String str1 = "Apple";
		System.out.println(str1.toLowerCase());
		
		System.out.println("\n---toUpperCase()-------");
		// str2 ���ڿ��� ��� �빮�ڷ� ��ȯ�Ͽ� ����
		String str2 = "abc";
		System.out.println(str2.toUpperCase());
		
		System.out.println("\n---charAt-------");
		// "Hello Java"���� J �� ��
		// char���� ch�� ����, ��� (charAt)
		
		char ch = "Hello Java".charAt(6);
		System.out.println(ch);
		
		System.out.println("\n---concat-------");	
		// str1�� ", HIHIHI" ��� ���ڿ� �߰��ϰ� ���
		System.out.println(str1.concat(", HIHIHI"));
		
		System.out.println("\n---replace-------");
		// str1�� 'A'�� 'a'�� ��ȯ
		System.out.println(str1.replace('A', 'a'));
		
		System.out.println("\n---replace-------");
		// str1���� "ple"�� "PLE"�� ��ȯ
		System.out.println(str1.replace("ple", "PLE"));
		
		System.out.println("\n---substring-------");
		// str1���� "pl" ã�Ƽ� ��� (substring)
		System.out.println(str1.substring(2, 4));
		
		System.out.println("\n---contains-------");
		// str1�� "pP"�� �ִ��� �Ǻ�
		System.out.println(str1.contains("pP"));

	}
}
