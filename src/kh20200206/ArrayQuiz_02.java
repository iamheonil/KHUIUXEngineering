package kh20200206;

public class ArrayQuiz_02 {
	public static void main(String[] args) {

//		 int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		 배열이 선언된 뒤 문제를 푸시오

		int arr[] = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };
		int invert_arr[] = new int[10];

		int first = 0;
		int sec = 0;

//		Q1.
//		위의 숫자를 invert_arr라는 배열에 거꾸로 입력하시오
//		=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }

//		for (int i = 0; i <= 9; i++) {
//				invert_arr[i] = arr[9-i];
//				System.out.print(invert_arr[i] + ", ");
//			}

//		Q2.
//		위의 숫자의 (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을 구하시오
//		정답은 -5가 나와야 함.

//		for (int i = 0; i < arr.length; i++) {
//			if (i % 2 == 0) {
//				sec += arr[i];
//				
//			} else if(arr[i] % 2 != 0) {
//				first += arr[i];
//			}
//		} System.out.println(first - sec);

//		Q3. 
//		위의 배열을 높은 숫자가 1등이 되게하여 rank_arr라는 배열에 순위를 입력하시오
//		    => arr : 	 { 10, 17, 3,  9, 27, 10, 8, 9, 13, 21 }
//		    => rank_arr :{  5,  3, 10, 7,  1,  5, 9, 7,  4,  2 }

		int vs_arr[] = new int[10];
		int rank_cArr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
			for (int i = 0; i < vs_arr.length; i++) {
				for (int j = 0; j < vs_arr.length; j++) {
				if(arr[i] < arr[j]) {
						rank_cArr[i]++;
					}
				} System.out.print(arr[i] + "\t");
			} System.out.println();
			
			for (int i = 0; i < vs_arr.length; i++) {
				System.out.print(rank_cArr[i] + "등\t");
			}

//		Q4. 
//		중복된 값은 over_arr에 넣고 중복되지 않은 값은 ret_arr에 입력하시오 정렬까지 했다면
//		    => over_arr : { 9, 10 }
//		    => ret_arr : { 3, 8, 13, 17, 21, 27 }

// ==========================================================================================

	} // Main End
} // Class End