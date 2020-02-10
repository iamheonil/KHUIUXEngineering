package kh20200210;

public class Array2DQuiz {
	public static void main(String[] args) {

//		int[][] QArr = new int[5][5];
//		int count = 0;

		// Q1 .
//		for (int i = 0; i < QArr.length; i++) {
//			for (int j = 0; j < QArr[i].length; j++) {
//				
//				QArr[i][j] = 1 + count++;
//				
//			}
//		}

//		// Q2 .
//		for (int j = 0; j < QArr.length; j++) {
//			for (int i = 4; i >= 0; i--) {
//				QArr[j][i] = 1 + count++;
//
//			}
//		}

		// Q3 .
//		for (int i = 0; i < QArr.length; i++) {
//			for (int j = 0; j < QArr[i].length; j++) {
//				
//				QArr[j][i] = 1 + count++;
//				
//			}
//		}

		// Q4 .
//		for (int j = 0; j < QArr.length; j++) {
//			for (int i = 4; i >= 0; i--) {
//				QArr[i][j] = 1 + count++;
//
//			}
//		}

		// Q5.
//		1    2    3    4    5
//		16   17   18   19   6
//		15   24   25   20   7
//		14   23   22   21   8
//		13   12   11   10   9
//		
//		01	02	03	04	05
//		11	12	13	14	15
//		21	22	23	24	25
//		31	32	33	34	35
//		41	42	43	44	45
		
		// j ->
		// i ↓
		
		// j 1~5까지 증가, i 1~5까지 증가, j 5~1까지 감소, i 4~1까지 감소, j 1부터 4까지, i 1부터 3까지,
		
		int[][] QArr = new int[10][10];
		int count = 0;
		
		for (int i = 0; i < QArr.length; i++) {
			for (int j = 0; j < QArr[i].length; j++) {
				
				QArr[i][j] = 1 + count++;
				
			

			}
		}

		// 아래는 출력소스
		// 건들지 말것
		for (int i = 0; i < QArr.length; i++) {
			for (int j = 0; j < QArr[i].length; j++) {

				System.out.print(QArr[i][j] + "\t");
			}
			System.out.println();
		}

	} // MAIN END
} // CLASS END