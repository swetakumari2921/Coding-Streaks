package my.strings.practice;

public class Ex106 {

	static String sortString(String str) {
		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		String words[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		boolean visited[] = new boolean[words.length];

		for (int i = 0; i < words.length; i++) {
			if (visited[i])
				continue;

			String key = sortString(words[i]);
			System.out.print("[ " + words[i] + " ");

			visited[i] = true;

			for (int j = i + 1; j < words.length; j++) {
				if (!visited[j] && key.equals(sortString(words[j]))) {
					System.out.print(words[j] + " ");
					visited[j] = true;
				}
			}
			System.out.println("]");
		}
	}
}