package my10.collection.linkedhashset.practice;

import java.util.LinkedHashSet;

public class Ex08 {
	public static void main(String[] args) {
        LinkedHashSet<String> employees = new LinkedHashSet<>();

        employees.add("Amit");
        employees.add("Pooja");
        employees.add("Rahul");

        String target = "Pooja";

        if (employees.contains(target)) {
            System.out.println(target + " exists in the LinkedHashSet.");
        } else {
            System.out.println(target + " does not exist in the LinkedHashSet.");
        }

        String missingTarget = "Neha";

        if (employees.contains(missingTarget)) {
            System.out.println(missingTarget + " exists in the LinkedHashSet.");
        } else {
            System.out.println(missingTarget + " does not exist in the LinkedHashSet.");
        }
    }
}
