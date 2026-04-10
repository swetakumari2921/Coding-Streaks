package my.strings.practice;

public class Ex117 {
	public static void main(String[] args) {
		String str = "abcde";
		int k = 2;

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					count++;
				}
				if (count <= k) {
					System.out.println(str.substring(i, j + 1));
				} else {
					break;
				}
			}
		}
	}
}
