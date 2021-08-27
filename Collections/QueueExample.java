package Java.Collections;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("India");
		queue.add("America");
		queue.add("Engalnd");
		queue.add("Australia");
		queue.add("Japan");
		queue.add("China");

		System.out.println("Priority Queue elements :" + queue);

		queue.remove();
		queue.poll();

		queue.add("Pakistan");
		queue.add("West Bengal");

		System.out.println("Head using peek: " + queue.peek());

	}

}
