package my08.collection.set.practice;

import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
        Set<String> frameworkSet = new HashSet<>();

        frameworkSet.add("Spring");
        frameworkSet.add("Hibernate");
        frameworkSet.add("Struts");

        String target = "Spring";

        if (frameworkSet.contains(target)) {
            System.out.println(target + " exists in the set.");
        } else {
            System.out.println(target + " does not exist in the set.");
        }

        String missingTarget = "React";

        if (frameworkSet.contains(missingTarget)) {
            System.out.println(missingTarget + " exists in the set.");
        } else {
            System.out.println(missingTarget + " does not exist in the set.");
        }
    }
}
