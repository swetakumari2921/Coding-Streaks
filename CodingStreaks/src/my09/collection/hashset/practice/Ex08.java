package my09.collection.hashset.practice;

import java.util.HashSet;

public class Ex08 {
	public static void main(String[] args) {
        HashSet<Integer> rollNumbers = new HashSet<>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        int target = 102;

        if (rollNumbers.contains(target)) {
            System.out.println(target + " exists in the HashSet.");
        } else {
            System.out.println(target + " does not exist in the HashSet.");
        }

        int missingTarget = 105;

        if (rollNumbers.contains(missingTarget)) {
            System.out.println(missingTarget + " exists in the HashSet.");
        } else {
            System.out.println(missingTarget + " does not exist in the HashSet.");
        }
    }
}
