package kh20200206;

public class Array {
	public static void main(String[] args) {

		// Array, 배열
		// 같은 데이터 타입의 변수를 하나의 묶음으로 사용하는것.
		// 여러개의 변수를 한번에 선언할 수 있다.
		// 선언하는 변수들의 작명 고민을 덜어준다.
		// 변수 선언코드를 여러번 사용하지 않아도 된다.

		// 기존의 변수는
		// '자료형' '이름' = 값 대입;
		// int num = 0;

		// 이번에 배우는 Array 는
		// 자료형[] 변수명;
		// int[] arr;
		// int[] -> 인트배열 이라고 얘기한다.

		// 기존의 변수와 다른 점
		// 기본 데이터 타입
		// 참조형, 사용방법이 많이 다르다.

		// 배열 생성 시 변수공간 묶음(배열)이 만들어진다.
		// 배열을 생성하면서 변수공간의 갯수를 정한다.

		// 배열의 선언
		// 배열 공간의 참조값을 저장할 수 있는 변수 선언

		// 데이터타입[] 변수명 // 추천
		// 데이터타입 변수명[] // 비추천

		// 배열의 생성
		// 실제 데이터가 저장될 수 있는 공간(요소, Element)을 생성한다.
		// 데이터타입[갯수] 변수명
		// 공간의 갯수 -> 숫자로 무조건 양수로!

		// 배열 생성
		// 자료형[공간갯수] 배열명;
		int[] arr;
		String[] Sarr;
		int[] asmr;

		// 사용공간 선언
		// int형 배열 생성한다(5개의 int형 공간)
		arr = new int[5];
		Sarr = new String[2];
		asmr = new int[5];

		/*
		 * arr = 10 20 30 40 50 [0] [1] [2] [3] [4] // [0] [1] ... [n] 을 요소(Elemnet) 라고
		 * 한다.
		 */

		// 배열의 요소 접근
		// 배열의 인덱스([0])를 이용하여 해당 값에 저장된 요소에 접근 가능하다.
		// 인덱스는 0부터 시작하고 1씩 증가하면서 지정된다.

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// 5 at kh20200206.Array.main(Array.java:41)
		// 범위 내의 없는 인덱스를 사용하면 입력한 인덱스의 값과 몇번째줄에서 오류가 발생했는지 알려준다.

		// 배열에 대입하기.
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		Sarr[0] = "안녕하세요";
//
//		// System.out.println(arr[0]);
//
//		for (int i = 0; i <= 4; i++) {
//			arr[i] = (i+1) * 100;
//		}
//
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(arr[i]);
//			// arr[i] = i 는 int i 0~4까지 늘어나니까
//		}
//		
//		System.out.println();
//		System.out.println(arr);			// [I@	2a139a55
//		System.out.println(Sarr);			// [Ljava.lang.String;@	15db9742
//		System.out.println(asmr);			// [I@	6d06d69c
//											// I@ 이후의 값.
//									// 배열의 이름은 메모리에 배열이 생성된 위치(주소, 참조)를 나타낸다.

//		int[] arrs = { 10, 20, 30, 40, 50 }; // 배열의 선언과 동시에 초기화!

//		double[] darr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//		boolean[] barr = { true, false };
//		// 배열의 모든 요소 출력하기
//
//		// arrs 를 출력하고자 한다면 0~4까지 5번 반복 해야한다.
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(arrs[i]);
//			}

		int[] tarr = { 1, 2, 3, 4, 5 };
		// 요소의 갯수 : 5개
		// 배열의 길이, 크기, 요소 모두 같은 말이다.

//		System.out.println("요소의 갯수 : " + tarr.length);
//												// length 는 요소의 갯수 출력

//		배열의 길이를 이용한 배열 전체 출력 
//		for (int i = 0; i < tarr.length; i++) {
//			System.out.println(tarr[i]);
//		}
		
//		System.out.println();
		
		// 배열의 인덱스 : 0 ~ 5
		// 음수를 입력하거나 인덱스보다 큰 값을 입력하면 ArrayIndexOutOfBoundsException 발생.
		// 음수를 입력하면 NegativeArraySizeException 발생.
		
//		int[] arr2;
//		arr2 = new int[1];
		
		// 문자열 String - Char 형들의 집합인 char[] 의 개념을 사용한다.
		
		String str = "Apple";
		char[] chArr = {'A', 'p', 'p', 'l', 'e'};
		
//		System.out.println("문자열의 길이 : " + str.length());
//		System.out.println("캐릭터의 길이 : " + chArr.length);
//		System.out.println("");
//		
//		System.out.println("문자열의 세번째 글자 : " + str.charAt(3));
//		System.out.println("캐릭터의 두번째 글자 : " + chArr[3]);
		
//		for(int i = 0; i <= 4; i++) {
//			System.out.println(str.charAt(i));
//		}
//		
//		for(int i = 0; i <= 4; i++) { 
//			System.out.println(chArr[i]);
//		}
		
		// String 과  char 포문 수행시 차이는 스트링변수명.charAt(인덱스값);
		// 										캐릭터배열변수명[인덱스값];
		//
		
//		String 타입을 Char 타입으로 변환하기 : toCharArray();
//		char[] converted = str.toCharArray();
		
//		반대로 Char[] 를 String 으로 변환하기
//		String restore = new String(converted);
		
//		String[]
//		String 배열
		
		String[] strArr;
		strArr = new String[3];
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
//		System.out.println("문자열 배열의 길이 : " + strArr.length);
//		System.out.println("배열의 첫번째 요소 : " + strArr[0].length() + " / " + strArr[0]);
//		
//		for (int i = 0; i <= 2; i++) {
//			System.out.println(strArr[i]);
//		}
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].length());
			System.out.println(strArr[i]);
			System.out.println();
		}
		
	}
}
