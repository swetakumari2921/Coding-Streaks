package my.collection;

import java.util.HashSet;
import java.util.Set;

class Student {
	private String name;

	Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class Ex26 {
	public static void main(String[] args) {
		Set<Student> hs = new HashSet<Student>();
		Student s1 = new Student("Amit");
		Student s2 = new Student("Sumit");
		Student s3 = new Student("Amit");
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs); // [Amit, Amit, Sumit]
		/*
		 * In this output why deplicates were not removed? 
		 * Ans: This is because when we
		 * add a new object to HashSet, then java searches it in the hash table using
		 * it's hash code. And if no object is found with the matching hash code then it
		 * inserts the new object in the HashSet.
		 */

		/*
		 * Now the raises a question "What is a hash code?" 
		 * Ans: The hash code of a java
		 * object is simply an integer allotted by the JVM to uniquely identify an
		 * object. To get the hash code of an object we can call the method hashcode()
		 * which is inherited by every class from the class Object. But with respect to
		 * Collections, hash code should not be unique for every object. As per
		 * Collections, If two objects are equals then these two objects should return
		 * same hash code. So we have to override hashcode() method of a class in such
		 * way that if two objects are equal, then those two objects must return same
		 * hash code. But, since we have not overridden hashcode() method in our student
		 * class so we got two student object having the same name.
		 */

		/*
		 * What other method we should override with hashcode()? 
		 * Ans: We should also
		 * override equals() along-with hashcode() because the HashSet also calls
		 * equals() along-with hashcode() to match the actual value. This is called
		 * hashcode-equals contract in java.
		 */

//		So, the implementation we are doing in next example.
	}
}
