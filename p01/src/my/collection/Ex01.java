package my.collection;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		// Creating ArrayList object
		// 1. Type unsafe
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add("Sweta");
		arr.add(2.4);
		arr.add(3.4f);
		arr.add('a');
		arr.add(false);
		
		int i = (int) arr.get(0);
		System.out.println(i);
		
		String s = (String) arr.get(1);
		System.out.println(s);
		
		double d = (double) arr.get(2);
		System.out.println(d);
		
		float f = (float) arr.get(3);
		System.out.println(f);
		
		char ch = (char) arr.get(4);
		System.out.println(ch);
		
		boolean bool = (boolean) arr.get(5);
		System.out.println(bool);
	}
}
