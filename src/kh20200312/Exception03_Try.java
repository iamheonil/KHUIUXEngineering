package kh20200312;

public class Exception03_Try {
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

		System.out.println("\n프로그램이 정상적으로 종료되었습니다.");
	
	}
}