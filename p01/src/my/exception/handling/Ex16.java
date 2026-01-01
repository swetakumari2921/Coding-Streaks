package my.exception.handling;

public class Ex16 {
public static void main(String[] args) {
	try {
	    System.out.println("Inside try");
	    int a = 10 / 0; // ArithmeticException
	} finally {
	    System.out.println("Inside finally - always runs");
	}
}
}
