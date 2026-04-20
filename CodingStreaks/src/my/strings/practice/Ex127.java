package my.strings.practice;

public class Ex127 {
	static void printSubseq(String str, int index, String result) {
		if (index == str.length()) {
			System.out.println(result);
			return;
		}

		printSubseq(str, index + 1, result + str.charAt(index));
		printSubseq(str, index + 1, result);
	}

	public static void main(String[] args) {
		String str = "abc";
		printSubseq(str, 0, "");
	}
}
