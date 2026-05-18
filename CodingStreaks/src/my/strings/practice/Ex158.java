package my.strings.practice;

public class Ex158 {

	public static boolean oneEditAway(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		// Difference greater than 1
		if (Math.abs(len1 - len2) > 1) {
			return false;
		}

		int i = 0, j = 0;
		int count = 0;

		while (i < len1 && j < len2) {

			if (s1.charAt(i) != s2.charAt(j)) {

				count++;

				if (count > 1) {
					return false;
				}

				// Insert/Delete case
				if (len1 > len2) {
					i++;
				} else if (len2 > len1) {
					j++;
				} else {
					// Replace case
					i++;
					j++;
				}

			} else {
				i++;
				j++;
			}
		}

		// Extra character at end
		if (i < len1 || j < len2) {
			count++;
		}

		return count == 1;
	}

	public static void main(String[] args) {

		String s1 = "cat";
		String s2 = "cut";

		if (oneEditAway(s1, s2)) {
			System.out.println("One edit away");
		} else {
			System.out.println("Not one edit away");
		}
	}
}
