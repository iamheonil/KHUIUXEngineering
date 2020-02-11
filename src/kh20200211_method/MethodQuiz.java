package kh20200211_method;

import java.util.Arrays;

// 설계를 담당하는 클래스



public class MethodQuiz {

	public void oneHund() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
}
	public void enterHello(int helNum) {
		for (int i = 1; i <= helNum; i++) {
			System.out.println("Hello");
		}
	}
	
	public void enterText(int textNum, String tText) {
		for (int i = 1; i <= textNum; i++) {
			System.out.println(tText);
		}
	}
	
	int count = 0;
	int[] arr = {11, 22, 33, 44, 55};

	
//	public void print(int[] arr) {
//			System.out.println(Arrays.toString(arr));
////			System.out.println(Arrays.toString(res));
//	}
//	
//	public void mul10(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] * 10;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
//	
//	public void mul10v2(int[] arr) {
//		int[] res = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			res[i] = arr[i] * 10;
//			}
//		System.out.println(Arrays.toString(res));
//		}
	
}