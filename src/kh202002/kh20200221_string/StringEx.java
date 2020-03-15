package kh202002.kh20200221_string;

public class StringEx {
	public static void main(String[] args) {

		String str1 = "Apple"; // 문자열 리터럴 상수
		String str2 = new String("BaNaNa"); // 문자열 객체

//		System.out.println(str1);
//		System.out.println(str2);

		System.out.println("length");
		System.out.println(str1.length());
		System.out.println(str2.length());

		System.out.println("Cherry의 길이 : " + "Cherry".length() + "\n");

		System.out.println("Equals");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("Apple.equals(str1) : " + "Apple".equals(str1));

		// 속을 수 있는 코드
		System.out.println("Apple==str1 : " + ("Apple" == str1));
		// ** 문자열을 비교할 때는 == 쓰지말고 equals() 메소드를 사용한다.

		String test = null;

//		if (test.equals("Durian")) {
//			System.out.println("같다");
//		}
		
		if ("Durian".equals(test)) {
			System.out.println("같다");
		} else {
			System.out.println("ㄷr르다");
		}

		String temp = "";
		
		
	}
}
