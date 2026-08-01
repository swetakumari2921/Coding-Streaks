package my.queue.practice;

import java.util.*;

public class Ex34 {

	static void scheduleTasks(Queue<String> tasks) {

		int time = 1;

		while (!tasks.isEmpty()) {
			String task = tasks.poll();

			System.out.println("Executing Task " + task + " at time " + time);

			time++;
		}
	}

	public static void main(String[] args) {

		Queue<String> tasks = new LinkedList<>();

		tasks.offer("Task A");
		tasks.offer("Task B");
		tasks.offer("Task C");
		tasks.offer("Task D");

		System.out.println("Task Execution Order:");

		scheduleTasks(tasks);
	}
}
