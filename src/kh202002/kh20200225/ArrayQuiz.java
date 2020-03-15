package kh202002.kh20200225;

import java.util.Arrays;

public class ArrayQuiz {
	public static void main(String[] args) {

		int[] arr = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };
		int[] ret_arr = new int[10];
		int[] over_arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					over_arr[j] = arr[i];
					arr[i] = 0;
					arr[j] = 0;
				}
			}
		}
		ret_arr = arr;

		Arrays.sort(ret_arr);
		Arrays.sort(arr);
		Arrays.sort(over_arr);

		System.out.print("ret_arr : ");
		for (int i = 4; i < arr.length; i++) {
			System.out.print(ret_arr[i] + " ");

		}

		System.out.println("\n");

		System.out.print("0ver_arr : ");
		for (int i = 8; i < arr.length; i++) {
			System.out.print(over_arr[i] + " ");
		}
	}
}
