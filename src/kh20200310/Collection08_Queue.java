package kh20200310;

import java.util.LinkedList;
import java.util.Queue;

public class Collection08_Queue {
	public static void main(String[] args) {

		// ����
		
		// DelayQueue
		// PriorityQueue
		
		Queue queue = new LinkedList();
		
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Clare");
		queue.offer("David");
		
		System.out.println(queue);
		
		System.out.println("ũ�� : " + queue.size());
		System.out.println();
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println();
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("ũ�� : " + queue.size());
	}
}
