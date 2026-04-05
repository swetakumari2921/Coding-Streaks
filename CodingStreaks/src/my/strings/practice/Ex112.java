package my.strings.practice;

public class Ex112 {
	public static void main(String[] args) {
		String str = "abc";
		int n = str.length();

		for (int i = 0; i < n; i++) {
			String rotated = str.substring(i) + str.substring(0, i);
			System.out.println(rotated);
		}
	}
}
