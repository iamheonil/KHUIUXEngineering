package kh20200310;

import java.util.Stack;

public class Collection07_Stack {
	public static void main(String[] args) {

		// ����
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
//		System.out.println(stack.isEmpty()); 	// stack.pop : apple ��½� - isEmpty : true
//		imEmpty ���ٴ� empty �� ����ϴ°� �ٶ����ϴ�.
		System.out.println(stack.empty()); 		// stack.pop : apple ��½� - Empty : true
		
		stack.push("Grape");
		stack.push("Orange");
		stack.push("Peach");
		
		System.out.println();
		
		// Stack �� ������� �ʴٸ�
		while ( ! stack.empty() ) {
			System.out.println(stack.pop());
		}
		
	}
}