package my.strings.practice;

public class Ex191 {

	static String[] history = new String[1000];
	static int top = -1;

	// save current state
	static void save(String text) {
		history[++top] = text;
	}

	static String append(String text, String s) {
		save(text);
		return text + s;
	}

	static String delete(String text, int k) {
		save(text);
		int n = text.length();

		if (k > n)
			k = n;

		return text.substring(0, n - k);
	}

	static String undo(String text) {
		if (top == -1)
			return text;
		return history[top--];
	}

	public static void main(String[] args) {

		String text = "";

		// operations
		text = append(text, "hello");
		text = append(text, "world");
		text = delete(text, 3);

		System.out.println("After operations: " + text);

		text = undo(text);
		System.out.println("After undo 1: " + text);

		text = undo(text);
		System.out.println("After undo 2: " + text);
	}
}
