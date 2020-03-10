package kh20200310;

import java.util.Stack;

public class Collection07_Stack {
	public static void main(String[] args) {

		// 스택
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println(stack);
		
		System.out.println();
		
		System.out.println(stack.pop()); // Cherry
		System.out.println(stack.pop()); // Banana
		System.out.println();
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println();
//		System.out.println(stack.pop()); // Apple
		System.out.println();
//		System.out.println(stack.isEmpty()); 	// stack.pop : apple 출력시 - isEmpty : true
//		imEmpty 보다는 empty 를 사용하는게 바람직하다.
		System.out.println(stack.empty()); 		// stack.pop : apple 출력시 - Empty : true
		
		stack.push("Grape");
		stack.push("Orange");
		stack.push("Peach");
		
		System.out.println();
		
		// Stack 이 비어있지 않다면
		while ( ! stack.empty() ) {
			System.out.println(stack.pop());
		}
		
	}
}