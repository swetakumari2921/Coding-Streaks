package my.collection;

import java.util.HashSet;
import java.util.Set;

public class Ex21HashSet {
	public static void main(String[] args) {
		Set<Integer> obj = new HashSet<>();
		obj.add(10);
		obj.add(20);
		obj.add(55);
		obj.add(34);
		obj.add(0);
		obj.add(null);
		obj.add(-3);
// 		obj.add(0, 9); // This add(index, element) method exists only in the List interface (ArrayList, LinkedList, etc.)
		// It is NOT available in Set implementations like HashSet, LinkedHashSet, or TreeSet
		obj.add(99);
		obj.add(-1);
		obj.add(-4);
		obj.add(5);
		System.out.println(obj);
	}
}
