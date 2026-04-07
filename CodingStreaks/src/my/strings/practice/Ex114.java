package my.strings.practice;

public class Ex114 {
	public static void main(String[] args) {
		String str = "abc";
		int n = str.length();
		int count = 0;

		for (int i = 0; i < n; i++) {
			boolean[] visited = new boolean[256];

			for (int j = i; j < n; j++) {
				char ch = str.charAt(j);

				if (visited[ch]) {
					break;
				}

				visited[ch] = true;
				count++;
			}
		}

		System.out.println(count);
	}
}
