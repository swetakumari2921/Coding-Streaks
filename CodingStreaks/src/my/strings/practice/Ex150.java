package my.strings.practice;

public class Ex150 {

	public static boolean oneLetterDiff(String a, String b) {

		int diff = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				diff++;
			}
		}

		return diff == 1;
	}

	public static int wordLadder(String start, String end, String[] words) {

		int n = words.length;

		boolean[] visited = new boolean[n];

		String[] queue = new String[100];
		int[] level = new int[100];

		int front = 0, rear = 0;

		queue[rear] = start;
		level[rear] = 1;
		rear++;

		while (front < rear) {

			String current = queue[front];
			int steps = level[front];
			front++;

			if (current.equals(end)) {
				return steps;
			}

			for (int i = 0; i < n; i++) {

				if (!visited[i] && oneLetterDiff(current, words[i])) {

					visited[i] = true;

					queue[rear] = words[i];
					level[rear] = steps + 1;
					rear++;
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {

		String start = "hit";
		String end = "cog";

		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };

		int result = wordLadder(start, end, words);

		System.out.println("Shortest Transformation Length = " + result);
	}
}
