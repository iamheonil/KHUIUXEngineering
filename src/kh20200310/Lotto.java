package kh20200310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		
		lottoDisplay();
		
	}

	private static void lottoDisplay() {
		
		Random ran = new Random();
		
		//1~45 사이의 난수
		//	ran.nextInt(45) + 1;
		
		Set set = new TreeSet();
		
		int cnt = 0; //TEST
		// TreeSet의 요소가 6개가 될 때까지 반복
		while( set.size() != 6 ) {
			set.add(ran.nextInt(45) + 1);
			
			cnt++; //TEST
		}

		System.out.println("[TEST] " + cnt + "번 반복하고 결과 얻음");
		System.out.println(set);
		
		System.out.println("---------------------");
		
		//방법1. List로 변환하기
		List list = new ArrayList(set);
		System.out.println( list );
		
		System.out.println("---------------------");
		
		//방법2. 배열로 변환하기
		Object[] arr = set.toArray();
		System.out.println( Arrays.toString(arr) );
		
	}
}