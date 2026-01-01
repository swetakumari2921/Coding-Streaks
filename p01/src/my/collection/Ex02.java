package my.collection;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		// Creating ArrayList object
		// 2. Type safe
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(24);
		arr.add(34);
		arr.add(65);
		arr.add(0);
		
		int i = arr.get(0);
		System.out.println(i);
		
		int s = arr.get(1);
		System.out.println(s);
		
		int d = arr.get(2);
		System.out.println(d);
		
		int f = arr.get(3);
		System.out.println(f);
		
		int ch = arr.get(4);
		System.out.println(ch);
		
		int bool = arr.get(5);
		System.out.println(bool);
		
		System.out.println(arr); //[10, 20, 24, 34, 65, 0]
	}
}
