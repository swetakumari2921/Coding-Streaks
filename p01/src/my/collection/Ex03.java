package my.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//Adding data in ArrayList
	// 1. public boolean add(Object)
	// 2. public void add(int, Object);

public class Ex03 {
	
	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<>();
		
//		List<Integer> obj2 = new LinkedList<>();
//		List<Integer> obj3 = new Vector<>();
//		List<Integer> obj4 = new Stack<>();
	
		obj.add(10); // public boolean add(Object)
		obj.add(30);
		obj.add(0, 5); // public void add(int, Object);
		obj.add(40);
		obj.add(null);
		obj.add(50);
		obj.add(3,1); 
		System.out.println(obj); // [5, 10, 30, 1, 40, null, 50]
		
		List<String> str = new ArrayList<>();
		System.out.println(str); // []

	}

}
