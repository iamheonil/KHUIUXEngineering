package kh202003.kh20200312;

public class Exception01_Basic {
	public static void main(String[] args) {

		// IndexOutOfBoundsException
		int[] arr = new int[5];
		System.out.println(arr[4]);
//		System.out.println(arr[5]);

		// NullPointerException
		int[] arr2 = new int[5];
		System.out.println(arr2[4]);
		arr2 = null;
//		System.out.println(arr2[6]);

		System.out.println("\n와일문 가즈앙\n");
		int i = 0;
//		while(true) {	// 무한루프
//			arr[i] = i + 1;
//		
//		System.out.println(arr[i]);
//		System.out.println(i + "번째 완료");
//		
//		i++;
//		
//		}

		while (true) { // 무한루프를 해결

			if (i < 0 || i >= arr.length) {	// 고전적인 방식의 예외처리, 지금도 사용하긴 한다.
				System.out.println("\n인덱스는 " + arr.length + "보다 작아야 합니다.");
				
				break;
			}

			arr[i] = i + 1;
			System.out.println(arr[i]);
			System.out.println(i + 1 + "번째 완료");

			i++;

		}
		
		System.out.println("\n프로그램이 정상적으로 종료되었습니다.");

	}
}