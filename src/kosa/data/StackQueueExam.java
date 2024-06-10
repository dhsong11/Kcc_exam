package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); // stack자료구조
		LinkedList<Integer> queue = new LinkedList<Integer>();//Queue자료구조
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("---stack---");
		
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
