package kh202002.kh20200225;

public class ForEachEx {
	public static void main(String[] args) {
	
		// ForEach 는 for문 이용하는 반복문
		// for문이 변형된 문법
		// 키워드가 따로 있지 않고 for 키워드를 그대로 사용한다.
		
		/////////////////////////////////////////////////////////////////////////
		// for( [데이터의 요소타입] [변수명] : [반복가능한 데이터] {
		// }
		/////////////////////////////////////////////////////////////////////////
		
		// 반복 가능한 형태 -> 배열, int[]
		// 데이터의 각 요소 타입은 -> int
		// int, double, boolean 등등 모든걸 받아 처리할 수 있는건 Object 밖에 없다.
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int printArr : arr) {	// 배열의 요소를 하나씩 printArr에 저장하며 반복
			System.out.println(printArr);
		}
		
	}
}