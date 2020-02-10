package kh20200210;

public class Array2DQuiz {
	public static void main(String[] args) {

		int[][] QArr = new int[5][5];
		int count = 0;

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