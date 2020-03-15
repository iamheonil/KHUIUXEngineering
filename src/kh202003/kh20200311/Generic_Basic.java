package kh202003.kh20200311;

import java.util.ArrayList;
import java.util.List;

public class Generic_Basic {
	public static void main(String[] args) {

		// 타입을 지정하지 않고 구현한다면 Object로 사용된다.
		List list = new ArrayList();
		list.add("Hello");
		
		// 부모인 List<String> 과 자식인 ArrayList 의 자료형이 다르다면 에러가 발생한다.
		// 무조건 같게 써줘야 한다b
		//  <E> 를 <String> 으로 지정했다.
		List<String> sList = new ArrayList<>();

		List<Integer> iList = new ArrayList<>();
		// List<Int> iList = new ArrayList<>(); 는 사용 불가
		// Wrapper 클래스를 사용해야 한다.
		
		// 타입 안정성
		// 제네릭을 사용할 때 자료형을 꼭 명시해줘야한다.
		sList.add("Hi");
		
		// String str1 = list.get(0); -> 타입 안정성이 없기에 형변환이 필요하다.
		String str1 = (String) list.get(0);
		
		// String으로 처리되어 형변환이 필요없다.
		String str2 = sList.get(0);
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}
}