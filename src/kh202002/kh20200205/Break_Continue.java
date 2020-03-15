package kh202002.kh20200205;

public class Break_Continue {
	public static void main(String[] args) {

		int i = 0;	// 초기식
		while ( i < 100 ) {	// 조건식
			i++; // 증감식
			
			if(i % 2 == 0) { // 다음 반복으로 넘어간다.
				continue;	 // Continue => 현재 반복을 중단하고 다음 반복 진행
			}
			
			if(i > 10) {	// i 가 10보다 크다면
				break;		// break; 를 수행한다.
							// break 가 수행되면 더 이상 수행 코드를 수행하지 않고 while문 밖으로 나가게 된다.
		
			}
			System.out.println(i); // 수행 코드
			
		}
	
		System.out.println("==========================");
		
		for(int j = 0; j < 100; j++) {
			if (j % 2 == 0) {
				continue;
			}
			
			if(j > 10) {
				break;
			}
			
			System.out.println(j);
		}
	
		
		
	}
}