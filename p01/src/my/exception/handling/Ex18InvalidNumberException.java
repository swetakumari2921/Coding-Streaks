package my.exception.handling;

public class Ex18InvalidNumberException extends Exception{
	//parameterized constructor which takes string as an argument
	public Ex18InvalidNumberException(String str) {
		super(str);
	}
}
