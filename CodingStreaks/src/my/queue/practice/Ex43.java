package my.queue.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex43 {

	private ArrayList<ArrayList<Integer>> graph;
	private int vertices;

	public Ex43(int vertices) {
		this.vertices = vertices;
		graph = new ArrayList<>();

		for (int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}
	}

	// Add undirected edge
	public void addEdge(int source, int destination) {
		graph.get(source).add(destination);
		graph.get(destination).add(source);
	}

	// Find shortest path using BFS
	public void shortestPath(int source, int destination) {

		Queue<Integer> queue = new LinkedList<>();

		boolean[] visited = new boolean[vertices];

		int[] distance = new int[vertices];

		int[] parent = new int[vertices];

		for (int i = 0; i < vertices; i++) {
			parent[i] = -1;
		}

		queue.add(source);
		visited[source] = true;
		distance[source] = 0;

		while (!queue.isEmpty()) {

			int current = queue.poll();

			if (current == destination) {
				break;
			}

			for (int neighbor : graph.get(current)) {

				if (!visited[neighbor]) {

					visited[neighbor] = true;
					distance[neighbor] = distance[current] + 1;
					parent[neighbor] = current;

					queue.add(neighbor);
				}
			}
		}

		if (!visited[destination]) {
			System.out.println("No path exists.");
			return;
		}

		// Print shortest distance
		System.out.println("Shortest distance: " + distance[destination]);

		// Reconstruct path
		LinkedList<Integer> path = new LinkedList<>();

		int current = destination;

		while (current != -1) {
			path.addFirst(current);
			current = parent[current];
		}

		System.out.println("Shortest path: " + path);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of vertices: ");
		int vertices = sc.nextInt();

		Ex43 graph = new Ex43(vertices);

		System.out.print("Enter number of edges: ");
		int edges = sc.nextInt();

		System.out.println("Enter edges:");

		for (int i = 0; i < edges; i++) {

			int source = sc.nextInt();
			int destination = sc.nextInt();

			graph.addEdge(source, destination);
		}

		System.out.print("Enter source: ");
		int source = sc.nextInt();

		System.out.print("Enter destination: ");
		int destination = sc.nextInt();

		graph.shortestPath(source, destination);

		sc.close();
	}
}
