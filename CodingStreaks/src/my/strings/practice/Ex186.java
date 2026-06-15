package my.strings.practice;

public class Ex186 {

	public static String multiply(String num1, String num2) {

		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int n1 = num1.length();
		int n2 = num2.length();

		int[] result = new int[n1 + n2];

		for (int i = n1 - 1; i >= 0; i--) {
			for (int j = n2 - 1; j >= 0; j--) {

				int digit1 = num1.charAt(i) - '0';
				int digit2 = num2.charAt(j) - '0';

				int product = digit1 * digit2;

				int pos1 = i + j;
				int pos2 = i + j + 1;

				int sum = product + result[pos2];

				result[pos2] = sum % 10;
				result[pos1] += sum / 10;
			}
		}

		StringBuilder sb = new StringBuilder();

		int i = 0;
		while (i < result.length && result[i] == 0) {
			i++;
		}

		while (i < result.length) {
			sb.append(result[i]);
			i++;
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String num1 = "123";
		String num2 = "456";

		System.out.println("First Number : " + num1);
		System.out.println("Second Number: " + num2);

		String product = multiply(num1, num2);

		System.out.println("Product      : " + product);
	}
}
