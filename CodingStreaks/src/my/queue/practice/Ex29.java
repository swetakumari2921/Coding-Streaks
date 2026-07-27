package my.queue.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ex29 {

	public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
		boolean[] visited = new boolean[graph.size()];
		Queue<Integer> queue = new LinkedList<>();

		visited[start] = true;
		queue.offer(start);

		System.out.print("BFS Traversal: ");

		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");

			for (int neighbor : graph.get(node)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.offer(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		int vertices = 5;

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}

		// Undirected graph
		graph.get(0).add(1);
		graph.get(0).add(2);

		graph.get(1).add(0);
		graph.get(1).add(3);
		graph.get(1).add(4);

		graph.get(2).add(0);

		graph.get(3).add(1);

		graph.get(4).add(1);

		bfs(graph, 0);
	}
}
