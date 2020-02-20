package kh20200220;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {

		Random ran = new Random();
		
		System.out.println(ran.nextInt(100));
		
		System.out.println();
		
		System.out.println(ran.nextBoolean());
		
		System.out.println();
		
		System.out.println(ran.nextDouble());
		
		System.out.println();
		
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3) + 1);
		
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}	
		
		Arrays.sort(arr);							// 정렬 
		System.out.println(Arrays.toString(arr)); 	// 출력
			
	}
}