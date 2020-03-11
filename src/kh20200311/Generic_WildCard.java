package kh20200311;

import java.util.Arrays;
import java.util.List;

public class Generic_WildCard {
		
	public static void display(List<?> list) {
//	public static void display(List<? extends Number> list) {	// <?> 때문에 모두 다 받지만 Number 의 속해 있는 자료형들만 받는다
//	public static void display(List<? super String> list) 	{
	
		for(Object o : list) {
			System.out.println( o );
			
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList(10, 20, 30);
		
		display(iList);
		
		List<String> sList = Arrays.asList("A", "B", "C");
		display(sList);
		
		Object o = null;
		Integer i = null;
		
		o = i;	// Object 는 Integer 의 부모이다.
		
		List<Object> ol = null;
		List<Integer> il = null;
		
		// ol = il; : 에러 
		// 제네릭은 자바의 기본 상속구조를 무시한다.
		// 기본원칙은 이러하지만 와일드 카드를 적용함으로써 에러를 빗겨나간다
		
	}
}