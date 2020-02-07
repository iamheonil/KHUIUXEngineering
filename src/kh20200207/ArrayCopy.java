package kh20200207;

public class ArrayCopy {
	public static void main(String[] args) {

		
//		배열 복사하기 (참조형 복사)
//		참조형을 강조하는 이유는 클라스부터 객체지향 프로그래밍을 배우게 되는데
//		클래스는 참조형이 기본이다. 그래서 이 구조를 잘 파악하지 않는다면 클래스부터 허덕이기때문에 공부 해야한다.
		
		int[] arr1 = {10, 20, 30};
		int[] arr2;
//		arr2 = arr1;	// 얕은복사
//		
//		System.out.println("대입 후 데이터 수정 전");
//		for (int i = 0; i <= 2; i++) {
//			System.out.println(arr1[i] + " : " + arr2[i] + " ");
//		}
//	
//		arr1[1] = 777;
//		arr2[2] = 999;
//
//		
//		System.out.println();
//		
//		System.out.println("대입 후 데이터 수정 후");
//		for (int i = 0; i <= 2; i++) {
//			System.out.println(arr1[i] + " : " + arr2[i] + " ");
//		}
		
		// arr1, 2 어느쪽에 대입을 해도 대칭한다. 왜?
		// arr2 = arr1;
		// 이런 현상을 얕은 복사 Shallow Copy라고 한다.
		// 참조 대상의 참조값(주소)만 복사 했을 때. -> 주소는 메모리 주소를 뜻한다.
		
		// 참조형 변수를 단순 대입했을 때 발생한다.
		// arr2, arr1 둘 다 똑같은 위치를 기준으로 하고 있기 때문에
		// 둘 중 하나를 수정하여 출력하더라도 같은 값을 출력할 수 밖에 없다.
	
//	<=================================================================== 위의 단순 대입 중요!

		
//	>=================================================================== 아래 깊은 대입	

//		Deep Copy, 깊은 복사
//		참조 대상의 내용물을 새로운 공간에 복사한다.
		
//		깊은 복사의 절차
//		1. 복사할 공간을 확보한다. (공간 생성)
//		arr2 = new int[arr1.length];
//		// arr1의 크기만큼 arr2의 공간을 만들어준다.
//		
//		2. 데이터를 복사한다. (for문을 이용)
//		for (int i = 0; i<arr2.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		
//		System.out.println("대입 후 데이터 수정 전");
//		for (int i = 0; i <= 2; i++) {
//			System.out.println(arr1[i] + " : " + arr2[i] + " ");
//		}
//	
//		arr1[1] = 777;
//		arr2[2] = 999;
//
//		
//		System.out.println();
//		
//		System.out.println("대입 후 데이터 수정 후");
//		for (int i = 0; i <= 2; i++) {
//			System.out.println(arr1[i] + " : " + arr2[i] + " ");
//		}
		
//		얕은 복사와 깊은 복사의 차이는
//		공간을 생성해주지 않고 단순 대입을 통한 복사인지
//		공간을 생성해준 상태에서 값을 그대로 복사하여 삽입하는것인가의 차이.
		
//		<=====================================================================================
		
//		1. 복사할 공간을 확보한다. (공간 생성)
		arr2 = new int[arr1.length];
//		// arr1의 크기만큼 arr2의 공간을 만들어준다.
		
//		2. System 클래스의 API 기능을 이용하여 데이터를 복사한다.
//		System.arraycopy (src, srcPos, dest, destPos, length);
//		arraycopy = 깊은복사
//		src : Source, 원본 배열
//		srcPos : Source Position, 원본 배열에서 복사를 시작할 인덱스 값 (0부터~)
//		dest : Destination, 원본 배열을 집어 넣을 배열 
//		destPos : Destination Position, 복사 배열의 몇번째 인덱스부터 넣을 지 설정.
//		length : 복사하는 데이터의 길이		
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
	
		System.out.println("대입 후 데이터 수정 전");
		for (int i = 0; i <= 2; i++) {
			System.out.println(arr1[i] + " : " + arr2[i] + " ");
		}
	
		arr1[1] = 777;
		arr2[2] = 999;
	
		System.out.println();
		
		System.out.println("대입 후 데이터 수정 후");
		for (int i = 0; i <= 2; i++) {
			System.out.println(arr1[i] + " : " + arr2[i] + " ");
		}
		
	
	} // Main End
} // Class End