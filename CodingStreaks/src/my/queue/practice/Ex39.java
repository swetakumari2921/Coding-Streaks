package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex39 {

	Queue<Integer> q;

	public Ex39() {
		q = new LinkedList<>();
	}

	public int ping(int t) {
		q.offer(t);

		while (!q.isEmpty() && q.peek() < t - 3000) {
			q.poll();
		}

		return q.size();
	}

	public static void main(String[] args) {
		Ex39 rc = new Ex39();

		System.out.println(rc.ping(1)); // 1
		System.out.println(rc.ping(100)); // 2
		System.out.println(rc.ping(3001)); // 3
		System.out.println(rc.ping(3002)); // 3
	}
}
