package my.strings.practice;

public class Ex107 {
	public static void main(String[] args) {
		String str = "abcabca";

		int maxCount = 0;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				int count = 0;

				for (int k = 0; k <= str.length() - sub.length(); k++) {
					if (str.substring(k, k + sub.length()).equals(sub))
						count++;
				}

				if (count > maxCount) {
					maxCount = count;
					result = sub;
				}
			}
		}

		System.out.println(result + " " + maxCount);
	}
}
