package my.strings.practice;

public class Ex108 {
	public static void main(String[] args) {
		String str = "abcab";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
		}

		System.out.println(count);
	}
}
