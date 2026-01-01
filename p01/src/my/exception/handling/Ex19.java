package my.exception.handling;

import java.util.Scanner;
//custom exception
public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 int: ");
			int a = sc.nextInt();
			int b= sc.nextInt();
			if(a<=0) {
				Ex18InvalidNumberException ex = new Ex18InvalidNumberException("Numerator should be positive");
				throw ex;
			}else if(b<=0) {
				Ex18InvalidNumberException ex = new Ex18InvalidNumberException("Denominator should be positive");
				throw ex;
			}
			int c = a/b;
			System.out.println("Division is: "+c);
		}catch(ArithmeticException | Ex18InvalidNumberException ex) { 
			System.out.println("Exception occurred: "+ex.getMessage());
		}
	}
}
