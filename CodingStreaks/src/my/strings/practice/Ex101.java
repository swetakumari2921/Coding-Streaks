package my.strings.practice;

public class Ex101 {
	public static void main(String[] args) {
		String s = "0101";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int zeros = 0, ones = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j) == '0')
					zeros++;
				else
					ones++;
				if (zeros == ones)
					count++;
			}
		}
		System.out.println(count);
	}
}
