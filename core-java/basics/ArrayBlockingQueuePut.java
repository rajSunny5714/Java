package basics;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuePut {

	public static void main(String[] args) {

		int capacity = 3;

		try {
			ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

			queue.put("Lorem Ipsum - First Element");
			queue.put("Lorem Ipsum - Second Element");
			queue.put("Lorem Ipsum - Third Element");

			System.out.println("Queue contains: " + queue);

		} catch (InterruptedException e) {
			System.out.println("Exception: " + e);
			Thread.currentThread().interrupt();
		}
	}
}