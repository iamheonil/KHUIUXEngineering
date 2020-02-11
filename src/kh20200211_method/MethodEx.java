package kh20200211_method;

import java.util.Arrays;

// Ex 는 exe -> 실행파일

public class MethodEx {
	public static void main(String[] args) {

		// 1. 기능클래스를 참조 선언해준다. Method_01 m01 = new Method_01();
		// 2. 생성된 기능을 불러온다. m01.add(int1, int2);
		// 3. 불러 온 기능의 값을 저장하고 출력한다.

		Method_01 m01 = new Method_01();
		Method_02 m02 = new Method_02();

		int res = m01.add(100, 200);

		System.out.println("저장 된 값 : " + res);
		System.out.println("프린트에서 바로 출력하는 방법 : " + m01.add(150, 100));
		System.out.println();

		System.out.println("========== 02번 ==========");
		m02.method01();
		m02.method02(1); // 전달인자, 전달인수, argument
							// 줄여서 인자, 인수 라고 하기도 한다.

		m02.printNum2(34, 70);
		System.out.println(m02.returnNum());
		System.out.println(m02.add(1230, 2027));

		System.out.println();
		System.out.println("========== 03번 ==========");

		Method_03 m03 = new Method_03();

		int[] arr = new int[5];
		int num;

		arr[2] = 100;
		num = 200;

		System.out.println("메소드 호출 전");
		System.out.println(Arrays.toString(arr));
		// Arrays.toString(배열명) -> 배열안의 들어가 있는 값들을 String 으로 바꾸어 출력해준다.
		// Arrays.Sort -> 정렬
		// Arrays.fill(배열명, 값); -> 배열안의 값으로 다 채워준다.
		System.out.println(num);

		m03.arrTest01(arr); // 참조, Reference 전달
		m03.arrTest02(num); // 값 Value 전달

		// Call By Value, 값에 의한 호출
		// 메소드를 호출할 때 전달되는 인자가 기본데이터타입일 때
		// 호출된 메소드 (Callee)에서 매개변수의 값을 변경하더라도 호출한(Caller) 메소드에서는 값이 변경되지 않는다.

		// Call By Reference, 참조에 의한 호출
		// 메소드를 호출할 때 전달되는 인자가 참조형일 때
		// 호출된 메소드 (Callee)에서 매개변수의 값을 변경하면 호출한(Caller) 메소드는 값이 변경된다.
		
		// Call By Address : Pointer						]	두개는 설명하지
		// Call By Name : 기본형이냐 참조형이나 구분없이	] 	않는다.
		
		System.out.println();
		System.out.println("메소드 호출 후");
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
		// Arrays 만 변경 되었고 num 은 변경되지 않았다.
		// 배열은 바뀌고 기본형 데이터는 왜 바뀌지 않았나?

		// 정적할당을 하느냐 동적할당을 하느냐에 따라 스택에, 힙에 배치된다.
		// int[] arr 정적 할당, 스택에 만들어지며
		// new int[5]; 는 동적 할당. 힙에 만들어 진다.

		/*
		 * 스택 | 힙
		 * 
		 */
		
		System.out.println("========== 04번 ==========");
		
		int n = m03.arrTest03();
		n = 20;
		
		int[] ar = m03.arrTest04();
		ar[0] = 99;
		
		System.out.println(n);
		System.out.println(ar[0]);

		
	}
}