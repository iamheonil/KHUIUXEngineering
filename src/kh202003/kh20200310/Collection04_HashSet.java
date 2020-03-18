package kh202003.kh20200310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection04_HashSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
//		Set set = new LinkedHashSet(); //삽입된 순서를 유지
//		Set set = new TreeSet(); //정렬된 상태를 유지
		
		set.add(30);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10);
		
		System.out.println(set);
		
		System.out.println("--------------");

		Iterator iter = set.iterator(); //반복자(iterator) 생성
		
		//Set의 모든 요소 출력하기
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
		System.out.println("--------------");

		Object[] arr = set.toArray(); // Set -> 배열
		
		System.out.println( Arrays.toString(arr) ); //배열 전체 출력
		
		Arrays.sort(arr); //배열 정렬하기
		
		//인덱스를 이용한 배열 전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------");
		
		// Set을 이용한 ArrayList 만들기
		List list = new ArrayList(set);
		System.out.println(list);
		
		System.out.println("---------------------");
		
		System.out.println("크기 : " + set.size());
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("222가 존재하는가? " + set.contains(222));
		System.out.println("30을 제거 : " + set.remove(30));
		
		System.out.println(set);
		
		set.clear(); //모든 요소 제거
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println(set);
		
	}
}















