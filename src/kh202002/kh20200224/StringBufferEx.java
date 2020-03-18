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

		System.out.println("String Buffer 생성자 호출");
		
		// 객체 생성을 해줘야 사용 가능하다.
		StringBuffer sb = new StringBuffer();
		
		// 문자열의 길이
		System.out.println("length : " + sb.length());
		
		// 문자열의 Capacity(수용 능력, 채워넣을 수 있는 한계, 케파라고 부르기도 한다.)
		System.out.println("케파케파");
		System.out.println("Capacity : " + sb.capacity());
		
		// '\' 제어문자의 사용 
		System.out.println("\nString Buffer(\"Hello\") 호출");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2);
		
//		System.out.println("length : " + sb2.length());
//		System.out.println("Capacity : " + sb2.capacity());
		info(sb2);
		
		System.out.println("\nStringBuffer(int) 호출");
		StringBuffer sb3 = new StringBuffer(5);
		info(sb3);

		System.out.println("\nApple 추가하기");
//		StringBuffer sb3 = new StringBuffer("Apple"); 기존의 방법
	
		sb3.append("Apple");
		
		System.out.println(sb3);
		info(sb3);
		
		sb3.append("Banana");
		
		System.out.println("\n문자열 추가 후\n" + sb3);
		info(sb3);
		
		System.out.println("\n == 퀴즈 == \n");
		sb3.insert(5, "Orange");
		System.out.println(sb3);
		
		sb3.deleteCharAt(3);
		syso(sb3);
		
		System.out.println("\nsubstring");
		String sub = sb3.substring(1, 7);
		syso(sb3);
		System.out.println(sub);
	
		System.out.println("trim 들어가기전");
		info(sb3);
		
		System.out.println("\ntrimtoSize");
		sb3.trimToSize();
		info(sb3);
		
		System.out.println("\nReverse");
		sb3.reverse();
		syso(sb3);
		
	
	}
}