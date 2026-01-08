package my.arrays.practice;

public class Ex07 {
	private int age;
	private String name;

	public Ex07(int age, String name) {
		age = age;
		name = name;
	}

	public void show() {
		System.out.println("age " + age + "name " + name);
	}

	public static void main(String[] args) {
		Ex07 obj = new Ex07(21, "sweta");
		obj.show();
	}
}
