package kh20200207;

public class Sort {
	public static void main(String[] args) {

//		Sort 정렬.
//		선택, 삽입, 버블 순으로 공부한다.
//		선택과 삽입은 빼고 버블 정렬만 본다

		int[] arr = { 3, 2, 5, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("< 버블 정렬 후 >");
		System.out.println();

		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {	// 라운드 반복
			for (int j = 0; j < 4; j++) {		// 스왑 반복
				if(arr[j] > arr[j+1]) {			// 스왑 조건 오름차순
//				if(arr[j] < arr[j+1]) {			// 스왑 조건 내림차순
					temp = arr[j];				// 스왑 식
					arr[j] = arr[j+1];
					arr[j+1] = temp;				
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		/*
		
		[j] > [j+1]
		temp <- j
		j -> j+1 값
		j+1 -> 템프?
		*/
		
	} // Main End
} // Class End