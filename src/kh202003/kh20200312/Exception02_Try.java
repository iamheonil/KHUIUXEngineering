package kh202003.kh20200312;

public class Exception02_Try {
	public static void main(String[] args) {

		System.out.println("\n와일문 가즈앙\n");

		int[] arr = new int[5];
		int i = 0;

		try {
			while (true) { // 무한루프
				arr[i] = i + 1;

				System.out.println(arr[i]);
				System.out.println(i + "번째 완료");

				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) { // Exception 으로 try catch 문 사용이 가능하지만 보다 안전하게 Exception 명을 써준다.
			// TODO: handle exception
			System.out.println("!! 예외 발생 !!");
			
			e.printStackTrace();	// 예외의 정보를 출력
		}

//		while (true) { // 무한루프를 해결
//
//			if (i < 0 || i >= arr.length) {	// 고전적인 방식의 예외처리, 지금도 사용하긴 한다.
//				System.out.println("\n인덱스는 " + arr.length + "보다 작아야 합니다.");
//				
//				break;
//			}
//
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//			System.out.println(i + 1 + "번째 완료");
//
//			i++;
//
//		}

		System.out.println("\n프로그램이 정상적으로 종료되었습니다.");
	
	}
}