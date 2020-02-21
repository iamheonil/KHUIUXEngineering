package kh20200221_wrapper;

public class WrapperEx {
	public static void main(String[] args) {

	// 박싱, Boxing
		// Wrapper : 포장지
		// 기본 데이터타입 -> 객체화
		// ** 기본 데이터타입의 데이터를 객체화하여 사용할 수 있게 해주는 클래스들 **

		// 기본형 타입 데이터를 참조형 변수로 사용할 수 있게 된다.
		// Boolean
		// Character
		// Byte, Short, Integer, Long
		// Float, Double
		
	// 언박싱, Unboxing
		// Wrapper 클래스 -> 기본 데이터타입 변환
		// Wrapper 클래스의 메소드를 이용한다.
		// int i2 = iVal2.intValue(); // Integer 에서 int 타입으로 변환해주는 코드
		
	// 오토 박싱, 오토 언박싱
		// 박싱, 언박싱이 자동으로 이루어지는 현상
		// 기본 데이터타입과 참조형(Wrapper)를 따로 구분하지 않고 사용할 수 있다.
		// ex)
		// Integer iVal = new Integer(123);
		// int num = 456;
		// int sum = iVal + num; // 에러없이 작동한다.
	
	// 파싱
		// 문자열에서 데이터를 추출하는 기능
		// Wrapper 클래스의 정적메소드로 구현된 parseXXX() 메소드를 이용한다.
		// 각 데이터타입에 맞는 형태의 문자열에서 해당 데이터타입으로 추출한다.
		// ex)
		// String str = "1234";
		// int num = Integer.parseInt(str);
		// double d = Double.parseInt("3.14");
		// ** Character 에는 파싱 메소드가 존재하지 않는다.
		// ** 대신 "문자열".charAt(idx) 를 사용한다.
		// ** Boolean형은 "true"만 제대로 파싱하고 나머지 문자열은 무조건 false로 반환.
		
		
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

		Integer iVal2 = new Integer(i1); // 박싱
		Integer iVal3 = new Integer("123");

		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);

		System.out.println();

		double d1 = 123.456;

		Double dVal1 = new Double(d1); // ㅂ박싱
		Double dVal2 = new Double("46.789"); // ㅂ박싱

		System.out.println(d1);
		System.out.println(dVal1);
		System.out.println(dVal2);
		System.out.println();

		String str = "1234"; // 문자열

		int num1 = Integer.parseInt(str);
//		**	parse : 추출하다.

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

		// boolean 은 true 이외에 다른 값이 들어가면 무조건 false 출력한다.
		String data = "true"; // true
//		String data = "t1231132";	// false
//		String data = "qeweqwwqe";	// false

		boolean b1 = Boolean.parseBoolean(data);

		System.out.println(b1);

		System.out.println();

		// 문자열에서 단일문자 데이터를 분리할 때는 charAt(index) 메소드를 사용한다.
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
//		intValue(iValT); ??? 이거 문법 안 맞는데
		
		int i2 = iVal2.intValue(); // Integer 에서 int 타입으로 변환해주는 코드

		// UnBoxing 언빡싱, 참조형을 기본형타입으로 바꾸기
		System.out.println(iVal2);
		System.out.println(i2);

		System.out.println();

		double d2 = dVal2.doubleValue();
//		double d2 = dVal2.intValue();
//		double d2 = dVal2.longValue();
		System.out.println(d2);

		System.out.println();
//		Integer iVal5 = new Integer(20);
		Integer iVal5 = 20; // 오토박싱

		System.out.println(iVal5);

	}
}