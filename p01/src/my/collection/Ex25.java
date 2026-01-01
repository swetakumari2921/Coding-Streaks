package my.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex25 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("Amit");
		hs.add("Sumit");
		hs.add("Amit");
		System.out.println(hs); // [Amit, Sumit]
	}
}
