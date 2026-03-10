package my.strings.practice;

public class Ex85 {

	public static int[] buildSuffixArray(String s) {
		int n = s.length();
		String[] suffixes = new String[n];
		int[] indices = new int[n];

		for (int i = 0; i < n; i++) {
			suffixes[i] = s.substring(i);
			indices[i] = i; // store original index
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (suffixes[i].compareTo(suffixes[j]) > 0) {
					String tempStr = suffixes[i];
					suffixes[i] = suffixes[j];
					suffixes[j] = tempStr;

					int tempIdx = indices[i];
					indices[i] = indices[j];
					indices[j] = tempIdx;
				}
			}
		}

		return indices;
	}

	public static void main(String[] args) {
		String s = "banana";
		int[] suffixArray = buildSuffixArray(s);

		System.out.println("Suffix Array:");
		for (int idx : suffixArray) {
			System.out.print(idx + " ");
		}
	}
}
