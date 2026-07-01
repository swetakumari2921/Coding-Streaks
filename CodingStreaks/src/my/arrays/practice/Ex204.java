package my.arrays.practice;

public class Ex204 {

	public static int secondSmallestMissingPositive(ArrayList<Integer> list) {
		int missingCount = 0;
		int num = 1;

		while (true) {
			boolean found = false;

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == num) {
					found = true;
					break;
				}
			}

			if (!found) {
				missingCount++;
				if (missingCount == 2) {
					return num;
				}
			}

			num++;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(4);
		list.add(-1);
		list.add(1);

		System.out.println("Second Smallest Missing Positive: " + secondSmallestMissingPositive(list));
	}
}
