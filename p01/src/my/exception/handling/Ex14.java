package my.exception.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex14 {
	public static void main(String[] args) {
//	try (FileInputStream fis = new FileInputStream("file1.txt");
//		     FileOutputStream fos = new FileOutputStream("file2.txt")) {

//		try (FileInputStream fis = new FileInputStream("file1.txt");
//				FileOutputStream fos = new FileOutputStream("file2.txt")) {

//		        int a = 10 / 0;  // ArithmeticException (unchecked)
//		        System.out.println("Program continues normally...");
//		    }

//		 FileReader fr = new FileReader("abc.txt"); // Checked exception
//	        System.out.println("File opened successfully");

//	        try {
//	            FileReader fr = new FileReader("abc.txt");
//	            System.out.println("Hello");
//	        } catch (FileNotFoundException e) {
//	            System.out.println("File not found: " + e.getMessage());
//	        }
//	    

		try {
			FileReader fr = new FileReader("abc.txt");
			System.out.println("Hello");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
