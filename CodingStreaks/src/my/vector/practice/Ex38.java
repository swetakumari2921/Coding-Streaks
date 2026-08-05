package my.vector.practice;

import java.util.Scanner;
import java.util.Vector;

public class Ex38 {

	// Function to check if subvector exists
	public static int findSubVector(Vector<Integer> mainVector, Vector<Integer> subVector) {

		int n = mainVector.size();
		int m = subVector.size();

		if (m > n) {
			return -1;
		}

		for (int i = 0; i <= n - m; i++) {

			boolean found = true;

			for (int j = 0; j < m; j++) {
				if (!mainVector.get(i + j).equals(subVector.get(j))) {
					found = false;
					break;
				}
			}

			if (found) {
				return i; // Starting index
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Integer> mainVector = new Vector<>();
		Vector<Integer> subVector = new Vector<>();

		System.out.print("Enter size of main vector: ");
		int n = sc.nextInt();

		System.out.println("Enter main vector elements:");
		for (int i = 0; i < n; i++) {
			mainVector.add(sc.nextInt());
		}

		System.out.print("Enter size of subvector: ");
		int m = sc.nextInt();

		System.out.println("Enter subvector elements:");
		for (int i = 0; i < m; i++) {
			subVector.add(sc.nextInt());
		}

		int index = findSubVector(mainVector, subVector);

		if (index != -1) {
			System.out.println("Subvector found at index: " + index);
		} else {
			System.out.println("Subvector not found.");
		}

		sc.close();
	}
}