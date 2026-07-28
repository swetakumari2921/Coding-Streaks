package my.queue.practice;

import java.util.*;

public class Ex30 {

	public static int countComponents(int V, ArrayList<ArrayList<Integer>> graph) {

		boolean[] visited = new boolean[V];
		int components = 0;

		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				components++;
				bfs(i, graph, visited);
			}
		}

		return components;
	}

	public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int node = queue.poll();

			for (int neighbour : graph.get(node)) {
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					queue.offer(neighbour);
				}
			}
		}
	}

	public static void main(String[] args) {

		int V = 7;

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}

		// Component 1
		graph.get(0).add(1);
		graph.get(1).add(0);

		graph.get(1).add(2);
		graph.get(2).add(1);

		// Component 2
		graph.get(3).add(4);
		graph.get(4).add(3);

		// Component 3
		graph.get(5).add(6);
		graph.get(6).add(5);

		System.out.println("Connected Components: " + countComponents(V, graph));
	}
}
