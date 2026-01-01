package my.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex32 {
	public static void main(String[] args) {
		Set<Integer> obj = new TreeSet<>();
		obj.add(10);
		obj.add(2);
		obj.add(40);
		obj.add(1);
		obj.add(30);
		obj.add(50);

//	System.out.println("Before sorting:\n"+ obj);
//	
//	System.out.println();

		System.out.println("Traversing using for-each");
		for (int x : obj) {
			System.out.print(x + " ");
		}

		System.out.println();
		System.out.println();

		System.out.println("Traversing using iterator");
		Iterator<Integer> it = obj.iterator();
		while (it.hasNext()) {
			int x = it.next();
			System.out.print(x+" ");
		}
	}
}
