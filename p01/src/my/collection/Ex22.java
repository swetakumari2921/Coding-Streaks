package my.collection;

import java.util.HashSet;
import java.util.Set;

public class Ex22 {
	public static void main(String[] args) {
		Set<String> obj = new HashSet<>();
		obj.add("A");
		obj.add("Z");
		obj.add("C");
		obj.add("E");
		obj.add("B");
		obj.add("K");
		obj.add("D");

		System.out.println(obj);
	}
}
