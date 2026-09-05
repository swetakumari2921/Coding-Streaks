package my11.collection.sortedset.practice;

import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
        SortedSet<Integer> marks = new TreeSet<>();

        marks.add(45);
        marks.add(78);
        marks.add(92);

        int target = 78;

        if (marks.contains(target)) {
            System.out.println(target + " exists in the SortedSet.");
        } else {
            System.out.println(target + " does not exist in the SortedSet.");
        }

        int missingTarget = 60;

        if (marks.contains(missingTarget)) {
            System.out.println(missingTarget + " exists in the SortedSet.");
        } else {
            System.out.println(missingTarget + " does not exist in the SortedSet.");
        }
    }
}
