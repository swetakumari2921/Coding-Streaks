package my.exception.handling;

public class Ex10b {
	public static void main(String[] args) {
		Ex10 obj = new Ex10(10, "Amit", 89.97);
		System.out.println(obj); //automatically calls toString() method
	}
}
