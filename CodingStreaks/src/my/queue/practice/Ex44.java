package my.queue.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex44 {

	private ArrayList<ArrayList<Integer>> graph;
	private int vertices;

	public Ex44(int vertices) {
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

	// Multi-source BFS
	public void multiSourceBFS(int[] sources) {

		Queue<Integer> queue = new LinkedList<>();

		int[] distance = new int[vertices];

		for (int i = 0; i < vertices; i++) {
			distance[i] = -1;
		}

		// Add all source nodes
		for (int source : sources) {
			queue.add(source);
			distance[source] = 0;
		}

		// BFS
		while (!queue.isEmpty()) {

			int current = queue.poll();

			for (int neighbor : graph.get(current)) {

				if (distance[neighbor] == -1) {

					distance[neighbor] = distance[current] + 1;

					queue.add(neighbor);
				}
			}
		}

		// Print minimum distance from any source
		System.out.println("\nMinimum distance from any source:");

		for (int i = 0; i < vertices; i++) {
			System.out.println("Vertex " + i + " -> " + distance[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of vertices: ");
		int vertices = sc.nextInt();

		Ex44 graph = new Ex44(vertices);

		System.out.print("Enter number of edges: ");
		int edges = sc.nextInt();

		System.out.println("Enter edges:");

		for (int i = 0; i < edges; i++) {

			int source = sc.nextInt();
			int destination = sc.nextInt();

			graph.addEdge(source, destination);
		}

		System.out.print("Enter number of source nodes: ");
		int sourceCount = sc.nextInt();

		int[] sources = new int[sourceCount];

		System.out.println("Enter source nodes:");

		for (int i = 0; i < sourceCount; i++) {
			sources[i] = sc.nextInt();
		}

		graph.multiSourceBFS(sources);

		sc.close();
	}
}
