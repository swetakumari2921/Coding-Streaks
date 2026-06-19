package my.strings.practice;

public class Ex190 {

	public static String validIPAddress(String ip) {

		if (isIPv4(ip)) {
			return "IPv4";
		}

		if (isIPv6(ip)) {
			return "IPv6";
		}

		return "Neither";
	}

	private static boolean isIPv4(String ip) {
		String[] parts = ip.split("\\.", -1);

		if (parts.length != 4) {
			return false;
		}

		for (String part : parts) {

			if (part.length() == 0 || part.length() > 3) {
				return false;
			}

			if (part.length() > 1 && part.charAt(0) == '0') {
				return false;
			}

			for (int i = 0; i < part.length(); i++) {
				if (!Character.isDigit(part.charAt(i))) {
					return false;
				}
			}

			int num = Integer.parseInt(part);

			if (num < 0 || num > 255) {
				return false;
			}
		}

		return true;
	}

	private static boolean isIPv6(String ip) {
		String[] parts = ip.split(":", -1);

		if (parts.length != 8) {
			return false;
		}

		for (String part : parts) {

			if (part.length() == 0 || part.length() > 4) {
				return false;
			}

			for (int i = 0; i < part.length(); i++) {
				char ch = part.charAt(i);

				boolean isHex = (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F');

				if (!isHex) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String ip1 = "172.16.254.1";
		String ip2 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
		String ip3 = "256.256.256.256";

		System.out.println(validIPAddress(ip1)); // IPv4
		System.out.println(validIPAddress(ip2)); // IPv6
		System.out.println(validIPAddress(ip3)); // Neither
	}
}
