package my.collection;

import java.util.LinkedList;
import java.util.List;

public class Ex20 {
	public static void main(String[] args) {
		List<String> obj = new LinkedList<>();
		obj.add("Ball");
		obj.add("Book");
		obj.add("Cat");
		obj.add(2, "Pen");
		obj.add("Dog");
		obj.add(0, "Laptop");
		obj.add("Jug");
		
		System.out.println(obj.get(2));
	}
}
