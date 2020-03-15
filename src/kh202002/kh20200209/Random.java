package kh202002.kh20200209;

import java.util.Arrays;

public class Random {
	public static void main(String[] args) {

//		int num = 45;

		int[] randomArr = new int[6];

		System.out.println("");
		System.out.println("");
		System.out.print("\t1~45 ºÎÅÍ ·£´ıÇÑ ¼ö¸¦ »Ì¾Æ³À´Ï´Ù. : ");
		for (int i = 0; i < randomArr.length; i++) {

			randomArr[i] = (int) (Math.random() * 45);

		}
		Arrays.sort(randomArr);
		for (int i = 0; i < randomArr.length; i++) {
			System.out.print(randomArr[i] + " ");	
		}
	}
	
}
