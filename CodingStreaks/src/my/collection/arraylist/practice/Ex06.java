package my.collection.arraylist.practice;

import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
		List<String> toDoList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of to-do list: ");
		int tn = sc.nextInt();
		sc.nextLine();
		if (tn <= 0) {
			System.out.println("Should be greater than 0");
			sc.close();
			return;
		}

		for (int i = 0; i < tn; i++) {
			System.out.println("Enter your task: ");
			String task = sc.nextLine();
			toDoList.add(task);
		}

		System.out.println("Number of task: " + tn);
		System.out.println("Tasks:");
		for(int i=0; i<tn; i++) {
			System.out.println(toDoList.get(i));
		}
		sc.close();
	}
}
