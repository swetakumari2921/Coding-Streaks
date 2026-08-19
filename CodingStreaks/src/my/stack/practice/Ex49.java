package my.stack.practice;

import java.util.*;

public class Ex49 {
	
	public static void dfs(int start, List<List<Integer>> graph) {

		boolean[] visited = new boolean[graph.size()];

		Stack<Integer> stack = new Stack<>();

		// Start node
		stack.push(start);

		while (!stack.isEmpty()) {

			int node = stack.pop();

			// Skip if already visited
			if (visited[node]) {
				continue;
			}

			visited[node] = true;

			System.out.print(node + " ");

			// Add neighbours to stack
			for (int i = graph.get(node).size() - 1; i >= 0; i--) {

				int neighbour = graph.get(node).get(i);

				if (!visited[neighbour]) {
					stack.push(neighbour);
				}
			}
		}
	}

	public static void main(String[] args) {

		int vertices = 6;

		List<List<Integer>> graph = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}

		// Add edges
		graph.get(0).add(1);
		graph.get(0).add(2);

		graph.get(1).add(0);
		graph.get(1).add(3);
		graph.get(1).add(4);

		graph.get(2).add(0);
		graph.get(2).add(5);

		graph.get(3).add(1);
		graph.get(4).add(1);

		graph.get(5).add(2);

		System.out.println("DFS Traversal:");

		dfs(0, graph);
	}
}
